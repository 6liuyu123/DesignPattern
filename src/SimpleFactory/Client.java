package SimpleFactory;

public class Client {
    public static void main(String[] args) {
        try {
            Product a=SimpleFactory.makeProduct(0);
            a.show();
            Product b=SimpleFactory.makeProduct(1);
            b.show();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }

    public interface Product{
        public void show();
    }

    static class ConcreteProduct1 implements Product {
        public void show(){
            System.out.println("具体产品A展示\n");
        }
    }

    static class ConcreteProduct2 implements Product {
        public void show(){
            System.out.println("具体产品B展示\n");
        }
    }

    final class Const{
        static final int PRODUCT_A=0;
        static final int PRODUCT_B=1;
        static final int PRODUCT_C=2;
    }

    static class SimpleFactory{
        public static Product makeProduct(int kind){
            switch(kind){
                case Const.PRODUCT_A:
                    return new ConcreteProduct1();
                case Const.PRODUCT_B:
                    return new ConcreteProduct2();
            }
            return null;
        }
    }
}