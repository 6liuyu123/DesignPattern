package Memento.Example2;

public class Caretaker {
    Memoto memoto;

    public void archive(Memoto memoto) {
        this.memoto = memoto;
    }

    public Memoto getMemoto() {
        return memoto;
    }
}