package Iterator.Example2;

import java.util.List;
import java.util.ArrayList;

public class ConcreteAggregate implements Aggregate {
    private List list = new ArrayList();
    public void add(Object obj) {
        list.add(obj);
    }
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

}
