package Bridge.Example2;

public class BridgeClient {
    public static void main(String[] args) {
        Transmission auto = new Auto();
        AbstractCar bmw = new BMWCar();
        bmw.setTransmission(auto);
        bmw.run();

        Transmission manual = new Manual();
        AbstractCar benz = new BenZCar();
        benz.setTransmission((manual));
        benz.run();

    }
}
