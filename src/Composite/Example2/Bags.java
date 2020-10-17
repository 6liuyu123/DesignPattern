package Composite.Example2;

import java.util.ArrayList;

public class Bags implements Articles{
    private String name;
    private ArrayList<Articles> bags = new ArrayList<Articles>();
    public Bags(String name) {
        this.name = name;
    }
    public void add(Articles c) {
        bags.add(c);
    }
    public void remove(Articles c) {
        bags.remove(c);
    }
    public Articles getChild(int i) {
        return bags.get(i);
    }
    public double calculation() {
        double s=0;
        for(Object obj:bags) {
            s+=((Articles)obj).calculation();
        }
        return s;
    }
    public void show() {
        for (Object obj:bags) {
            ((Articles)obj).show();
        }
    }
}
