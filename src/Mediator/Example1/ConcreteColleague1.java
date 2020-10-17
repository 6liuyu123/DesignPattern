package Mediator.Example1;

public class ConcreteColleague1 extends Colleague {
    public void receive() {
        System.out.println("具体同事1收到请求...");
    }
    public void send() {
        System.out.println("具体同时1发出请求...");
        mediator.relay(this);
    }
}
