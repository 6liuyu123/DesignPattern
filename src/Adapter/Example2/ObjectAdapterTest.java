package Adapter.Example2;

class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("Object adapter pattern test.");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
