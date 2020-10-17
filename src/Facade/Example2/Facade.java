package Facade.Example2;

public class Facade {
    SubSystemA_Light light;
    SubSystemB_Television television;
    SubSystemC_Aircondition aircondition;

    public Facade(SubSystemA_Light light, SubSystemB_Television television, SubSystemC_Aircondition aircondition) {
        this.light = light;
        this.television = television;
        this.aircondition = aircondition;
    }

    public void on() {
        System.out.println("Wake up.");
        light.on();
        television.on();
        aircondition.on();
    }

    public void off() {
        light.off();
        television.off();
        aircondition.off();
        System.out.println("Sleep down.");
    }
}
