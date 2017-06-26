package pub.sharecode.leon.designpattern.AbstractFactoryPattern;

/**
 * 具体工厂类1
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
