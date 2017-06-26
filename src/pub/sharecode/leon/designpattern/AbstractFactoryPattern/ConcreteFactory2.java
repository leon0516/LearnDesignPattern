package pub.sharecode.leon.designpattern.AbstractFactoryPattern;

/**
 * 具体工厂类2
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
