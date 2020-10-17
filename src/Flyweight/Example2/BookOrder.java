package Flyweight.Example2;

public class BookOrder implements FlyWeight {
    private String name;
    BookOrder(String name) {
        this.name = name;
    }
    @Override
    public void sell() {
        System.out.println("卖了一本书，书名为"+this.name+"");
    }
}
