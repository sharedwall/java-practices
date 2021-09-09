package sprint2.exercise11;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TaskInvocationHandler implements InvocationHandler {
    private final Object obj;

    public TaskInvocationHandler(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        Object result;
        if (m.getName().contains("get")) {
            System.out.println("...get Method Executing...");
        } else {
            System.out.println("...set Method Executing...");
        }
        result = m.invoke(obj, args);
        return result;
    }
}
