package Builder.example1;

public class ConcreteBuilder extends Builder {
    public void buildPartA() {
        product.setPartA("build PartA");
    }

    public void buildPartB()
    {
        product.setPartB("build PartB");
    }

    public void buildPartC()
    {
        product.setPartC("build PartC");
    }
}
