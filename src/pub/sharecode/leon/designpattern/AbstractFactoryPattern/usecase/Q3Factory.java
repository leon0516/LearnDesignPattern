package pub.sharecode.leon.designpattern.AbstractFactoryPattern.usecase;

/**
 * Q3工厂类
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
