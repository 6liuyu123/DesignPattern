package Mediator.Example2;

public class Ministry extends AbstractColleague {
    public Ministry(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void buildPalace() {
        super.abstractMediator.dealThing(Mediator.MINISTRY_CODE);
    }

    public void selfFunction() {
        System.out.println("要建筑图纸没问题");
    }
}
