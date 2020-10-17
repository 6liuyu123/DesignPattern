package Prototype.example4;

public class ProtoTypeShape {
    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = (Circle)pm.getShape("Circle");
        obj1.countArea();
        Shape obj2 = (Shape)pm.getShape("Square");
        obj2.countArea();
    }
}
