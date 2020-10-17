package Mediator.Example2;

public class Department extends AbstractColleague {
    public Department(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }
    public void dealDisaster() {
        super.abstractMediator.dealThing((Mediator.DEPARTMENT_CODE));
    }
    public void selfFunction() {
        System.out.println("要钱没问题");
    }
}
