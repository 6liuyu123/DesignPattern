package Memento.Example2;

public class Main {
    public static void main(String[] args) {
        CallOfDuty callOfDuty = new CallOfDuty();
        callOfDuty.play();
        Caretaker caretaker = new Caretaker();
        caretaker.archive(callOfDuty.createMemoto());
        CallOfDuty callOfDuty1 = new CallOfDuty();
        callOfDuty1.restore((caretaker.getMemoto()));
    }
}
