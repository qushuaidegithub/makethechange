import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test {
	public static void main(String[] args) throws IOException {
		File file = new File("demo.zip");
		FileOutputStream fs = new FileOutputStream(file);
		
		CheckedOutputStream check = new CheckedOutputStream(
				fs, new Adler32());
		
		ZipOutputStream zout = new ZipOutputStream(check);

		BufferedOutputStream out = new BufferedOutputStream(zout);

		ArrayList<String> list = new ArrayList<String>();
		list.add("date.txt");
		list.add("text.txt");
		//zout.setComment("wwww");
		for (String string : list) {
			BufferedReader in = new BufferedReader(new FileReader(string));
			int i = 0;
			zout.putNextEntry(new ZipEntry(string+"111.txt"));
			while ((i = in.read()) != -1) {
				System.out.println();
				out.write(i);
			}
			System.out.println();
			out.flush();
			in.close();
		}
		out.close();
		file.delete();//删除！！！！！！！！！！！！

	}
}
