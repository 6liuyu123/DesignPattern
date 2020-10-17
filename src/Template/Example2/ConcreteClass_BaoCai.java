package Template.Example2;

public class ConcreteClass_BaoCai extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("放入包菜");
    }
    @Override
    public void pourSauce() {
        System.out.println("放入辣椒");
    }
}
