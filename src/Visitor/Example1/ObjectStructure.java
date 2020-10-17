package Visitor.Example1;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();
    public void accept(Visitor visitor) {
        Iterator<Element> i = list.iterator();
        while(i.hasNext()) {
            ((Element) i.next()).accept(visitor);
        }
    }
    public void add(Element element) {
        list.add(element);
    }
    public void remove(Element element) {
        list.remove(element);
    }
}
