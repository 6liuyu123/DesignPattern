package State.Example2;

public class Dead extends ThreadState {
    public Dead() {
        stateName = "dead";
        System.out.println("Now in dead...");
    }
}
