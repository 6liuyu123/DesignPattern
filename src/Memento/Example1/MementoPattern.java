package Memento.Example1;

public class MementoPattern {
    public static void main(String[] args) {
        Originator or = new Originator();
        Caretaker cr = new Caretaker();
        or.setState("s0");
        cr.setMemento(or.createMemento());
        or.setState("s1");
        System.out.println("新的状态："+or.getState());
        or.restoreMemento(cr.getMemento());
        System.out.println("恢复状态"+or.getState());
    }
}
