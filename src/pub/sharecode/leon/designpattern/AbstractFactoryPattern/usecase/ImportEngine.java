package pub.sharecode.leon.designpattern.AbstractFactoryPattern.usecase;

/**
 * 进口发动机类
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public class ImportEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("进口发动机");
    }
}
