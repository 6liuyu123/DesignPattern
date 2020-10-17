package Strategy.Example1;

public class StrategyPattern {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();

    }
}
