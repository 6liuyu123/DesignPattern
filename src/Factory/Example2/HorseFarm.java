package Factory.Example2;

public class HorseFarm implements AnimalFarm{
    public Animal newAnimal(){
        System.out.println("new horse:");
        return new Horse();
    }
}
