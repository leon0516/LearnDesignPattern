package pub.sharecode.leon.designpattern.AbstractFactoryPattern.usecase;

/**
 * 越野轮胎类
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public class SUVTire implements ITire {
    @Override
    public void tire() {
        System.out.println("越野轮胎");
    }
}
