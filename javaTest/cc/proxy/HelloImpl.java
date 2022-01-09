/**
 * Created by lenovo on 2017/5/29.
 */
public class HelloImpl implements Hello {
    @Override
    public void say(String name) {
        System.out.println("Hello,"+name+"!");
    }
}
