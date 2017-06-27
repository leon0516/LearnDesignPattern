package pub.sharecode.leon.designpattern.singleton;

/**
 * Double CheckLock 单例模式
 * <p>优点:资源利用率高,第一次getDclSingleton时单例对象才会被实例化,效率高.
 * <br>缺点:第一次加载时反应稍慢.
 * </p>
 *
 * @author leon
 * @version 1.0, 17-6-27.
 */
public class DCLSingleton {
    private static DCLSingleton dclSingleton = null;

    private DCLSingleton() {
    }

    /**
     * 获取单例
     *
     * @return 单例
     */
    public static DCLSingleton getDclSingleton() {
        if (dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                if (dclSingleton == null) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }
}
