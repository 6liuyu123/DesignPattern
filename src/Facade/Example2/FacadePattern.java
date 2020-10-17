package Facade.Example2;

public class FacadePattern {
    public static void main(String[] args) {
        SubSystemA_Light light = new SubSystemA_Light();
        SubSystemB_Television television = new SubSystemB_Television();
        SubSystemC_Aircondition aircondition = new SubSystemC_Aircondition();

        Facade facade = new Facade(light, television, aircondition);

        facade.on();
        facade.off();
    }
}
