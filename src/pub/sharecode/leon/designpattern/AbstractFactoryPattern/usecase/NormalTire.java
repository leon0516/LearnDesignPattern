package pub.sharecode.leon.designpattern.AbstractFactoryPattern.usecase;

/**
 * 普通轮胎类
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
