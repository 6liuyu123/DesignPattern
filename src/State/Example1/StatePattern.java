package State.Example1;

public class StatePattern {
    public static void main(String[] args) {
        Context context = new Context();
        context.Handle();
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
