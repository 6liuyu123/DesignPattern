package Composite.Example2;

public class ShoppingTest {
    public static void main(String[] args) {
        double s=0;
        Bags BigBag,mediumBag,smallRedBag,smallWhiteBag;
        Goods sp;
        BigBag=new Bags("Big bag.");
        mediumBag=new Bags("Medium bag.");
        smallRedBag=new Bags("Small red bags.");
        smallWhiteBag=new Bags("Small white bags.");
        sp=new Goods("Xiamen special.",2,7.9);
        smallRedBag.add(sp);
        sp=new Goods("Xiamen map.",1,9.9);
        smallWhiteBag.add(sp);
        sp=new Goods("Quanzhou special.",2,68);
        smallWhiteBag.add(sp);
        sp=new Goods("Quanzhou redtea.",3,180);
        smallWhiteBag.add(sp);
        sp=new Goods("Quanzhou china.",1,380);
        mediumBag.add(sp);
        mediumBag.add(smallRedBag);
        sp=new Goods("Lining sneaker.",1,198);
        BigBag.add(sp);
        BigBag.add(smallWhiteBag);
        BigBag.add(mediumBag);
        System.out.println("The goods you choose are:");
        BigBag.show();
        s=BigBag.calculation();
        System.out.println("要支付的总价："+s+"元。");
    }
}
