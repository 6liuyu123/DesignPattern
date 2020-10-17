package Prototype.example2;

public class ProtoTypeWukong {
    public static void main(String[] args) {
        System.out.println("原型模式测试");
        SunWuKong sun1 = new SunWuKong();
        SunWuKong sun2 = (SunWuKong)sun1.clone();
        System.out.println("sun1 == sun2?"+(sun1 == sun2));
    }
}
