package com.test.time;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.sql.BLOB;

public class Task implements Runnable {

	static int count = 0;
	
	synchronized void addCount() {
		count++;
	}
	
	@Override
	public void run() {
		System.err.println("定时器开始执行……");
		addCount();
		System.out.println(count);
		try {
			doSql();
			//Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void doSql() {
		String sqls[] = new String[] {"select 1 from dual","sql2"};

		Connection conn = null;
		PreparedStatement pre = null;
		ResultSet rs = null;
		List<Object> list = null;
		try {
			conn = Main.pool.getConnection();
			pre = conn.prepareStatement(sqls[0]);
			pre.execute();
			rs = pre.getResultSet();
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			list = new ArrayList<Object>();
			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					list.add(rs.getObject(i));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 使用完后应马上关闭
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (pre != null) {
				try {
					pre.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			ConnectionPool.getInstance().release(conn);// 看了连接池ConnectionPool代码这里应释放而不是关闭.
		}

		// 把db查询和写入文件分开是为了提高数据库性能.数据库使用完后马上归还连接池.
		BufferedWriter bw = null;
		try {
			// 写入数据
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/data1.txt", true), "GBK"));
			if (list != null && list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					Object object = list.get(i);
					if (object != null) {
						if (object instanceof String || object instanceof Character) {
							bw.write(object.toString());
						} else if (object instanceof Integer || object instanceof Float || object instanceof Double || object instanceof Byte) {
							bw.write((Integer) object);
						} else if (object instanceof BLOB) {
							BLOB blob = (BLOB) object;
							if (blob.isEmptyLob()) {
								bw.write("\r\n");
							} else {
								bw.write(blob.toString());
							}
						}
					} else {
						bw.write("\r\n");
					}
				}
			} else {
				bw.write("\r\n");
			}

			System.out.println("一次传输完成");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
