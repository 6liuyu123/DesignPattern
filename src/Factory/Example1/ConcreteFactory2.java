package Factory.Example1;

class ConcreteFactory2 implements AbstractFactory{
    public Product newProduct(){
        System.out.println("具体工厂2-->具体产品2");
        return new ConcreteProduct2();
    }
}
