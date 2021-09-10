package sprint2.exercise11;

public class TestProxyFactory {
    public static void main(String[] args) {
        Task task = (Task)ProxyFactory.newInstance(new TaskImpl());
        task.setData("Test");
        System.out.println(task.getCalData(5));
    }
}
