package State.Example2;

public class Runnable extends ThreadState {
    public Runnable() {
        stateName = "Runnable";
        System.out.println("Now in runnable...");
    }

    public void getCPU(ThreadContext hj) {
        System.out.println("Get cpu's time-->");
        if (stateName.equals("Runnable")) {
            hj.setState(new Running());
        } else {
            System.out.println("Now isn't runnable, can't get CPU...");
        }
    }
}
