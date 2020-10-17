package State.Example1;

public class ConcreteStateA extends State {
    public void Handle(Context context) {
        System.out.println("当前状态是A");
        context.setState(new ConcreteStateB());
    }
}
