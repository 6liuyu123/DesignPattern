package AbstractFactory.Example2;

public class SRfarm {
    public Animal newAnimal(){
        System.out.println("放入马");
        return new Horse();
    }
    public Plant newPlant(){
        System.out.println("放入水果");
        return new Fruitage();
    }
}
