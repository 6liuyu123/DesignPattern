package Mediator.Example2;

public abstract class AbstractMediator {
    protected Department department;
    protected Defense defense;
    protected Ministry ministry;

    public AbstractMediator() {
        department = new Department(this);
        defense = new Defense(this);
        ministry = new Ministry(this);
    }

    public abstract void dealThing(int code);
}
