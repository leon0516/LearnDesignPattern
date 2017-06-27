package pub.sharecode.leon.designpattern.singleton;

/**
 * 饿汉单例模式
 *
 * @author leon
 * @version 1.0, 17-6-27.
 */
public class HungrySingleton {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    /**
     * 获取单例
     *
     * @return 单例
     */
    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
