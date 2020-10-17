package Observer.Example2;

public class BellTest {
    public static void main(String[] args) {
        BellEventSource bell = new BellEventSource(); // 事件源
        bell.addPersonListener(new TeachEventListener());
        bell.addPersonListener(new StuEventListener());
        bell.ring(true);
        System.out.println("------------------");
        bell.ring(false);
    }
}
