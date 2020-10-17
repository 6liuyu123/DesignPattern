package Prototype.example1;

public class ProtptypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype)obj1.clone();
        System.out.println("obj1 == obj2?" + (obj1 == obj2));
    }
}
