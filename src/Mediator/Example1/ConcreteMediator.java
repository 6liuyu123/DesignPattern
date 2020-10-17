package Mediator.Example1;

import java.util.List;
import java.util.ArrayList;

// 具体中介者
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<Colleague>();
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }
    public void relay(Colleague c1) {
        for (Colleague ob: colleagues) {
            if (!ob.equals(c1)) {
                ((Colleague)ob).receive();
            }
        }
    }
}
