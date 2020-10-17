package Proxy.Example2;

public class ProxyPattern {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}
