package Interpreter;

public class InterpreterPattern {
    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("北京的老人");
        bus.freeRide("北京的年轻人");
        bus.freeRide("上海的妇女");
        bus.freeRide("上海的儿童");
        bus.freeRide("山东的儿童");
    }
}
