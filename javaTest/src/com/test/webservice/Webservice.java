package com.test.webservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by THINKPAD on 2019/9/20.
 */
@WebService
public class Webservice {

    public String getValue(String name){
        return "hello"+name;
    }

    public static void main(String[] args){
        Endpoint.publish("http://localhost:1008/service/myService",new Webservice());
        System.out.print("发布成功");
    }
}
