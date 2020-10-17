package Factory.Example2;

class CattleFarm implements AnimalFarm{
    public Animal newAnimal(){
        System.out.println("新牛出生! ");
        return new Cattle();
    }
}
