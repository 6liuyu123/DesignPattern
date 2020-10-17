package Proxy.Example2;

public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("buy a mac");
    }
}
