package Observer.Example1;

public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obj1 = new ConcreteObserver1();
        Observer obj2 = new ConcreteObserver2();
        subject.add(obj1);
        subject.add(obj2);
        subject.notifyObserver();
    }
}
