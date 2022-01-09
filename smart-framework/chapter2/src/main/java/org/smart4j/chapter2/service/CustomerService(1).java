package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.util.PropsUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;


/**
 * Created by lenovo on 2017/5/7.
 */
public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList(){
//        Connection conn = null;
//        List<Customer> customerList = new ArrayList<Customer>();
//        try {
            String sql="SELECT * FROM customer";
            return DatabaseHelper.queryEntityList(Customer.class,sql);
//            conn = DatabaseHelper.getConnection();
//            customerList = DatabaseHelper.queryEntityList(Customer.class,conn,sql);
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            ResultSet rs = stmt.executeQuery();
//            while (rs.next()){
//                Customer customer = new Customer();
//                customer.setId(rs.getLong("id"));
//                customer.setName(rs.getString("name"));
//                customer.setContact(rs.getString("contact"));
//                customer.setTelephone(rs.getString("telephone"));
//                customer.setEmail(rs.getString("email"));
//                customer.setRemark(rs.getString("remark"));
//                customerList.add(customer);
//            }

//        }
//        catch (SQLException e){
//            LOGGER.error("execute sql failure",e);
//        }
//        finally{
//            DatabaseHelper.closeConnection(conn);
//        }
//        return customerList;
    }
    public Customer getCustomer(long id){
        String sql = "SELECT * FROM customer WHERE id =?";

        return DatabaseHelper.queryEntity(Customer.class,sql,id);
    }
    public boolean createCustomer(Map<String,Object> fieldMap){

        return DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }
    public boolean updateCustomer(long id, Map<String,Object> fieldMap){

        return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }
    public boolean deleteCustomer(long id){

        return DatabaseHelper.deleteEntity(Customer.class,id);
    }
}
