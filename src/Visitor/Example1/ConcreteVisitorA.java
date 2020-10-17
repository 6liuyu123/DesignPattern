package Visitor.Example1;

public class ConcreteVisitorA implements Visitor {
    public void visit(ConcreteElementA element) {
        System.out.println("Concrete visitorA visit " + element.operationA());
    }
    public void visit(ConcreteElementB element) {
        System.out.println("Concrete visitorA visit " + element.operationB());
    }
}
