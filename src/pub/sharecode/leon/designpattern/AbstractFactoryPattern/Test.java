package pub.sharecode.leon.designpattern.AbstractFactoryPattern;

/**
 * 测试
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        factory1.createProductA().method();
        factory1.createProductB().method();
        ConcreteFactory2 factory2 = new ConcreteFactory2();
        factory2.createProductA().method();
        factory2.createProductB().method();
    }
}
