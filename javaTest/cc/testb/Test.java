import java.lang.reflect.Proxy;

/**
 * Created by lenovo on 2017/5/29.
 */
public class Test {

    public static void  main(String[] args){

        System.out.println("=====================");
        Hello hello = new HelloImpl();

        DynamicProxy dynamicProxy = new DynamicProxy(hello);

        //Hello helloProxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(),hello.getClass().getInterfaces(),dynamicProxy);

        Hello helloProxy = (Hello)dynamicProxy.getProxy();
        
        helloProxy.say("Jack");
    }
}
