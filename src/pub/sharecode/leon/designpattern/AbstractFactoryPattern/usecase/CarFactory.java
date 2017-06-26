package pub.sharecode.leon.designpattern.AbstractFactoryPattern.usecase;

/**
 * 抽象汽车工厂
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public abstract class CarFactory {
    /**
     * 生产轮胎
     *
     * @return 轮胎
     */
    public abstract ITire createTire();

    /**
     * 生产发动机
     *
     * @return 发动机
     */
    public abstract IEngine createEngine();

    /**
     * 生产制动系统
     *
     * @return 制动系统
     */
    public abstract IBrake createBrake();
}
