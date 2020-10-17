package Strategy.Example2;

public class Context {
    private Strategy strategy;

    public Context(String festival) {
        switch (festival) {
            case "A":
                strategy = new StrategyA();
                break;
            case "B":
                strategy = new StrategyB();
                break;
            case "C":
                strategy = new StrategyC();
                break;
        }
    }

    public void strategyShow() {
        strategy.show();
    }
}
