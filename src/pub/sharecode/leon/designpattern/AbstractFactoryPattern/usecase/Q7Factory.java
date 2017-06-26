package pub.sharecode.leon.designpattern.AbstractFactoryPattern.usecase;

/**
 * Q7工厂类
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
