package Adapter.Example4;

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void sampleOperation1() {
        this.adaptee.sampleOperation1();
    }

    public void sampleOperation2() {
        System.out.println("This is Adapter.class");
    }

    public void sampleOperation() {
        sampleOperation1();
        sampleOperation2();
    }
}
