package Mediator.Example1;

public class ConcreteColleague2 extends Colleague {
    public void receive() {
        System.out.println("具体同事2收到请求...");
    }
    public void send() {
        System.out.println("具体同事2发出请求...");
        mediator.relay(this);
    }
}
