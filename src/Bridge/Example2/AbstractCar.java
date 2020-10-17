package Bridge.Example2;

public abstract class AbstractCar {
    protected Transmission gear;

    public abstract void run();

    public void setTransmission(Transmission gear) {
        this.gear = gear;
    }
}
