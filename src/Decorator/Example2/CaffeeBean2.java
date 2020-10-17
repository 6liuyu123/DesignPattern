package Decorator.Example2;

public class CaffeeBean2 implements Beverage {
    private String description = "第二种咖啡豆";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
