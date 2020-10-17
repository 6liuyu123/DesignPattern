package Singleton.HungrySingleton.Example;

public class HungrySingleton {
    public static void main(String[] args) {
        President p1 = President.getInstance();
        p1.getName();
        President p2 = President.getInstance();
        p2.getName();
        if (p1 == p2) {
            System.out.println("他们是同一个人");
        } else {
            System.out.println("他们不是同一个人");
        }
    }
}
