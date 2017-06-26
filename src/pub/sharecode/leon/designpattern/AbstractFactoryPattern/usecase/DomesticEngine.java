package pub.sharecode.leon.designpattern.AbstractFactoryPattern.usecase;

/**
 * 国产发动机类
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public class DomesticEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}
