package Template.Example2;

public abstract class AbstractClass {
    // final表示不希望子类覆盖
    final void cookProcess() {
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    void pourOil() {
        System.out.println("倒油");
    }

    void heatOil() {
        System.out.println("热油");
    }

    abstract void pourVegetable();
    abstract void pourSauce();
    void fry() {
        System.out.println("炒啊炒");
    }
}
