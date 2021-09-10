package sprint2.exercise9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StringInvocationHandler implements InvocationHandler {
    private final String theString;

    public StringInvocationHandler(String theString) {
        this.theString = theString;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method call : " + method.getName());
        Object result = method.invoke(theString, args);
        System.out.println("after method call : " + method.getName());
        return result;
    }

    public static void main(String[] args) {
        StringInvocationHandler handler = new StringInvocationHandler("the example string");
        CharSequence o = (CharSequence) Proxy.newProxyInstance(
                StringInvocationHandler.class.getClassLoader(),
                new Class[]{CharSequence.class}, handler);
        System.out.println(o.length());
        System.out.println(o.subSequence(4, 8));
    }
}
