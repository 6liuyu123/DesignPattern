package Interpreter;

public class Context {
    private String[] citys = {"北京", "上海"};
    private String[] persons = {"老人", "妇女", "儿童"};
    private Expression cityPerson;
    public Context() {
        Expression city = new TerminalExpression(citys);
        Expression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city, person);
    }
    public void freeRide(String info) {
        boolean ok = cityPerson.interpret(info);
        if (ok) {
            System.out.println("你是" + info + ",乘车免费");
        } else {
            System.out.println("扣费2元");
        }
    }
}
