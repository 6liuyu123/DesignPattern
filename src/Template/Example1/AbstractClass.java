package Template.Example1;

public abstract class AbstractClass {
    //  模版方法
    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }
    //  具体方法
    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }
    //  抽象方法
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();
}
