package pub.sharecode.leon.designpattern.singleton;

/**
 * 懒汉单例模式
 *
 * @author leon
 * @version 1.0, 17-6-27.
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    /**
     * 获取单例
     *
     * @return 单例
     */
    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }
}
