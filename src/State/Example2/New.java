package State.Example2;

public class New extends ThreadState {
    public New() {
        stateName="New";
        System.out.println("Now in New...");
    }

    public void start(ThreadContext hj) {
        System.out.println("Invoke start() method-->");
        if (stateName.equals("New")) {
            hj.setState(new Runnable());
        } else {
            System.out.println("Now isn't new, can't invoke start().");
        }
    }
}
