package Factory.Example1;

class ConcreteFactory1 implements AbstractFactory{
    public Product newProduct(){
        System.out.println("具体工厂1-->具体产品1");
        return new ConcreteProduct1();
    }
}
