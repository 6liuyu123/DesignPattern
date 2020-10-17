package Template.Example2;

public class Template_Method {
    public static void main(String[] args) {
        ConcreteClass_BaoCai BaoCai = new ConcreteClass_BaoCai();
        BaoCai.cookProcess();
        ConcreteClass_CaiXin Caixin = new ConcreteClass_CaiXin();
        Caixin.cookProcess();
    }
}
