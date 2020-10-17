package Strategy.Example2;

public class StrategyPattern {
    public static void main(String[] args) {
        Context context;

        System.out.println("春节");
        context = new Context("A");
        context.strategyShow();

        System.out.println("中秋节");
        context = new Context("B");
        context.strategyShow();

        System.out.println("圣诞节");
        context = new Context("C");
        context.strategyShow();
    }
}
