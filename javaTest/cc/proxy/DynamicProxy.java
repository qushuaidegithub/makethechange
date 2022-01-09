import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/5/29.
 */
public class DynamicProxy implements InvocationHandler{

    private Object target;
    public DynamicProxy(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target,args);
        after();
        return result;
    }

    private void before(){
        System.out.println("before……");
    }

    private void after(){
        System.out.println("after……");
    }
}
