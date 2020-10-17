package Decorator.Example2;

public class Test {
    public static void main(String[] args) {
        Beverage beverage = new CoffeeBean1();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription()+"\n加了摩卡和牛奶的咖啡的价格"+beverage.getPrice());
    }
}
