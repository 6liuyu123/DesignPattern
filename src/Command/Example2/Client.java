package Command.Example2;

public class Client {
    public static void main(String[] args) {
        // 创建接收者
        Receiver receiver = new Receiver();
        // 创建命令对象
        Command command = new ConcreteCommand(receiver);
        // 创建请求者
        Invoker invoker = new Invoker(command);
        // 执行方法
        invoker.action();
    }
}
