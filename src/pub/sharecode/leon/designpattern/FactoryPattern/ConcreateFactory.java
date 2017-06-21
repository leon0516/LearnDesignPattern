package pub.sharecode.leon.designpattern.FactoryPattern;

/**
 * 实现的一个工厂
 *
 * @author leon
 * @version 1.0, 17-6-21.
 */
public class ConcreateFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}
