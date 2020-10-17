package AbstractFactory.Example2;

class SGfarm implements Farm{
    public Animal newAnimal(){
        System.out.println("放入牛");
        return new Cattle();
    }
    public Plant newPlant(){
        System.out.println("放入蔬菜");
        return new Vegetables();
    }
}
