package Mediator.Example2;

public class Client {
    public static void main(String[] args) {
        AbstractMediator abstractMediator = new Mediator();
        Department department = new Department(abstractMediator);
        department.dealDisaster();
        Defense defense = new Defense(abstractMediator);
        defense.fight();
        Ministry ministry = new Ministry(abstractMediator);
        ministry.buildPalace();
    }
}
