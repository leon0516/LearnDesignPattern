package pub.sharecode.leon.designpattern.singleton;

/**
 * 静态内部类单例模式
 *
 * @author leon
 * @version 1.0, 17-6-27.
 */
public class InternalClassSingleton {

    private InternalClassSingleton() {
    }

    /**
     * 获取单例
     *
     * @return 单例
     */
    public InternalClassSingleton getInternalClassSingleton() {
        return SingletonHolder.internalClassSingleton;
    }

    /**
     * 内部静态类
     */
    private static class SingletonHolder {
        /**
         * 单例对象
         */
        private static final InternalClassSingleton internalClassSingleton = new InternalClassSingleton();
    }
}
