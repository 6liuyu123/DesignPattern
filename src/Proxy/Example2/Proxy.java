package Proxy.Example2;

public class Proxy implements Subject {
    @Override
    public void buyMac() {

        RealSubject realSubject = new RealSubject();
        realSubject.buyMac();
        // 代理对象额外做的工作
        this.WrapMac();
    }

    public void WrapMac() {
        System.out.println("用盒子包好Mac");
    }
}
