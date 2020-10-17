package Flyweight.Example2;

import java.util.ArrayList;
import java.util.List;

public class PatternTest {
    private static List<FlyWeight> orders = new ArrayList<FlyWeight>();
    private static FlyWeightFactory factory;

    private static void takeOrders(String bookName) {
        orders.add(factory.getOrder(bookName));
    }

    public static void main(String[] args) {
        factory = FlyWeightFactory.getInstance();
        takeOrders("三国演义");
        takeOrders("水浒传");
        takeOrders("红楼梦");
        takeOrders("西游记");
        takeOrders("三国演义");
        takeOrders("红楼梦");
        takeOrders("三体");

        for (FlyWeight order: orders) {
            order.sell();
        }

        System.out.println("客户一共买了"+orders.size()+"本书。");
        System.out.println("共生成了"+factory.getTotalObjects()+"个对象");

    }
}
