package pub.sharecode.leon.designpattern.FactoryPattern;

/**
 * 测试实例
 *
 * @author leon
 * @version 1.0, 17-6-21.
 */
public class Test {
    /**
     * 测试例子
     *
     * @param args 运行程序参数
     */
    public static void main(String[] args) {
        Factory factory = new ConcreateFactory();
        Product productA = factory.createProduct(ConcreateProductA.class);
        productA.method();
        Product productB = factory.createProduct(ConcreateProductB.class);
        productB.method();
    }
}
