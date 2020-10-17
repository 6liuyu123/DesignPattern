package Adapter.Example1;

public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("Test!");
        Target target = new ClassAdapter();
        target.request();
    }
}
