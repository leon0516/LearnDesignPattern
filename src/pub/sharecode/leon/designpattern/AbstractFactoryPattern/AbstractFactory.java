package pub.sharecode.leon.designpattern.AbstractFactoryPattern;

/**
 * 抽象工厂类
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public abstract class AbstractFactory {
    /**
     * 创建产品A的方法
     *
     * @return 产品A对象
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建产品B的方法
     *
     * @return 产品B对象
     */
    public abstract AbstractProductB createProductB();
}
