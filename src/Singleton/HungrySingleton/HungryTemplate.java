package Singleton.HungrySingleton;

public class HungryTemplate {
    private static final HungryTemplate instance = new HungryTemplate();

    private HungryTemplate() {

    }

    public static HungryTemplate getInstance() {
        return instance;
    }
}
