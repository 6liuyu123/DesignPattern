package State.Example2;

public class Running extends ThreadState {
    public Running() {
        stateName = "Running";
        System.out.println("Now in Running.");
    }

    public void suspend(ThreadContext hj) {
        System.out.println("invoke suspend() method-->");
        if (stateName.equals("Running")) {
            hj.setState(new Blocked());
        } else {
            System.out.println("Now isn't in running, can't invoke suspend() method...");
        }
    }

    public void stop(ThreadContext hj) {
        System.out.println("invoke stop() method-->");
        if (stateName.equals("Running")) {
            hj.setState(new Dead());
        } else {
            System.out.println("Now isn't in running, can't invoke stop() method...");
        }
    }
}
