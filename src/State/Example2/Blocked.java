package State.Example2;

public class Blocked extends ThreadState {
    public Blocked() {
        stateName="Blocked";
        System.out.println("Now in Blocked");
    }

    public void resume(ThreadContext hj) {
        System.out.println("Invoke resume() method-->");
        if (stateName.equals("Blocked")) {
            hj.setState(new Runnable());
        } else {
            System.out.println("Now isn't blocked, can't invoke resume() method.");
        }
    }
}
