package Visitor.Example1;

public class ConcreteVisitorB implements Visitor {
    public void visit(ConcreteElementA element) {
        System.out.println("Concrete visitorB visit " + element.operationA());
    }

    public void visit(ConcreteElementB element) {
        System.out.println("Concrete visitorB visit " + element.operationB());
    }
}
