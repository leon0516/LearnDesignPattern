package pub.sharecode.leon.designpattern.FactoryPattern;

/**
 * 抽象工厂
 *
 * @author leon
 * @version 1.0, 17-6-21.
 */
public abstract class Factory {
    /**
     * 抽象工厂方法
     * 创建产品
     *
     * @param <T> Product的子类
     * @param clz 产品对象类类型
     * @return 具体的产品对象
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
