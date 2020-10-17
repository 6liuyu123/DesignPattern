package Composite.Example2;

public class Goods implements Articles {
    private String name;
    private int quantity;
    private double unitPrice;

    public Goods(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double calculation() {
        return quantity*unitPrice;
    }

    public void show() {
        System.out.println(name+"数量："+quantity+"，单价："+unitPrice+"元");
    }
}
