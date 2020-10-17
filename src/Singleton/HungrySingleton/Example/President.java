package Singleton.HungrySingleton.Example;

class President {
    private static final President instance = new President();

    private President() {
        System.out.println("产生一个总统");
    }

    public static President getInstance() {
        return instance;
    }

    public void getName() {
        System.out.println("我是美国总统特朗普");
    }

}
