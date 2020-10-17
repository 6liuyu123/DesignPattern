package Adapter.Example1;

class ClassAdapter extends Adaptee implements Target {
    public void request() {
        specificRequest();
    }
}
