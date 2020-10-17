package Flyweight.Example2;

import java.util.Map;
import java.util.HashMap;

public class FlyWeightFactory {
    private Map<String, FlyWeight> bookPools = new HashMap<String, FlyWeight>();
    private static FlyWeightFactory factory = new FlyWeightFactory();

    public static FlyWeightFactory getInstance() {
        return factory;
    }

    public FlyWeight getOrder(String bookName) {
        FlyWeight order = null;
        if (bookPools.containsKey(bookName)) {
            order = bookPools.get(bookName);
        } else {
            order = new BookOrder((bookName));
            bookPools.put(bookName, order);
        }
        return order;
    }

    public int getTotalObjects() {
        return bookPools.size();
    }
}
