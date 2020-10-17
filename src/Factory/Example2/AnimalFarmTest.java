package Factory.Example2;

public class AnimalFarmTest {
    public static void main(String[] args){
        try{
            Animal a;
            AnimalFarm af;
            af=new CattleFarm();
            a=af.newAnimal();
            a.show();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
