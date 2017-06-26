package pub.sharecode.leon.designpattern.AbstractFactoryPattern.usecase;

/**
 * 普通制动类
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
