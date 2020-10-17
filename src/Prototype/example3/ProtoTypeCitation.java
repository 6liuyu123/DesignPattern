package Prototype.example3;

public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        citation obj1 = new citation("张三", "三好学生", "厦门大学");
        obj1.display();
        citation obj2 = (citation)obj1.clone();
        obj2.setName("李四");
        obj2.display();
    }
}
