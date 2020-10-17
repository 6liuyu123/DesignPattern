package Bridge.Example2;

public class BenZCar extends AbstractCar {

    @Override
    public void run() {
        gear.gear();
        System.out.println("BenzCar is running.");
    }
}
