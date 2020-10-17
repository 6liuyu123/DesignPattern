package Mediator.Example2;

public class Mediator extends AbstractMediator {
    public static final int DEPARTMENT_CODE = 1;
    public static final int DEFENSE_CODE = 2;
    public static final int MINISTRY_CODE = 3;

    @Override
    public void dealThing(int code) {
        switch (code) {
            case DEPARTMENT_CODE:
                this.dealDisaster();
                break;
            case DEFENSE_CODE:
                this.fight();
                break;
            case MINISTRY_CODE:
                this.buildPalace();
                break;
        }
    }

    private void dealDisaster() {
        System.out.println("户部");
        super.ministry.selfFunction();
        super.defense.selfFunction();
    }

    private void fight() {
        System.out.println("兵部");
        super.department.selfFunction();
        super.ministry.selfFunction();
    }

    private void buildPalace() {
        System.out.println("工部");
        super.department.selfFunction();
        super.defense.selfFunction();
    }
}
