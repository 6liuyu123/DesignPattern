package Visitor.Example2;

import java.util.ArrayList;

public class ObjectStructure {
    private ArrayList<Element> elements = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (int i = 0; i < elements.size(); i++) {
            Element element = elements.get(i);
            element.accept(visitor);
        }
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }
}
