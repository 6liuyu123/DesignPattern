package Adapter.Example2;

import org.omg.CORBA.Object;

class ObjectAdapter implements Target {
    private Adaptee adaptee;
    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    public void request() {
        adaptee.specificRequest();
    }
}
