package Bridge.Example2;

public class BMWCar extends AbstractCar {
    @Override
    public void run() {
        gear.gear();
        System.out.println("BMW is running.");
    };
}
