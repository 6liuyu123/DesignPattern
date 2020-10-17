package Singleton.LazySingleton;

// 对于多线程来说
public class LazyTemplate {
    private static volatile LazyTemplate instance = null;   //  保证Singleton在所有线程中同步

    private LazyTemplate() {
        //  private避免类在外部被实例化
    }

    public static synchronized LazyTemplate getInstance() {
        // getInstance方法前加同步
        if (instance == null) {
            instance = new LazyTemplate();
        }
        return instance;
    }
}
