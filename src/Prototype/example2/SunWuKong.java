package Prototype.example2;

public class SunWuKong implements Cloneable {
    private static final long serialVersionUID = 5543049531872119328L;
    public SunWuKong() {
        System.out.println("创建一个悟空");
    }
    public Object clone() {
        SunWuKong w = null;
        try {
            w = (SunWuKong)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("复制悟空失败");
        }
        return w;
    }
}