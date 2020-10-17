package Adapter.Example4;

public class Main {
    public static void main(String[] args) {
        Adaptee apaptee = new Adaptee();
        Adapter adapter = new Adapter(apaptee);
        adapter.sampleOperation();
    }
}
