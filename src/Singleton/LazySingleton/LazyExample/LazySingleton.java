package Singleton.LazySingleton.LazyExample;

public class LazySingleton {
    public static void main(String[] args) {
        President zt1 = President.getInstance();
        zt1.getName();
        President zt2 = President.getInstance();
        zt2.getName();
        if (zt1 == zt2) {
            System.out.println("他们是同一人");
        } else {
            System.out.println("他们不是同一人");
        }
    }
}
