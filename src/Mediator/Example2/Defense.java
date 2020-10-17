package Mediator.Example2;

public class Defense extends AbstractColleague{
    public Defense(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }
    public void fight() {
        super.abstractMediator.dealThing(Mediator.MINISTRY_CODE);
    }
    public void selfFunction() {
        System.out.println("要人没问题");
    }
}
