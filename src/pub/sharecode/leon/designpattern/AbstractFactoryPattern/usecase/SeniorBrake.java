package pub.sharecode.leon.designpattern.AbstractFactoryPattern.usecase;

/**
 * 高级制动类
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
