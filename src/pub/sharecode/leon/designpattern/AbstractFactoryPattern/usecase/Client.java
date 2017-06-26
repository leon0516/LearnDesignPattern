package pub.sharecode.leon.designpattern.AbstractFactoryPattern.usecase;

/**
 * 客户端调用
 *
 * @author leon
 * @version 1.0, 17-6-26.
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factoryQ3 = new Q3Factory();
        factoryQ3.createTire().tire();
        factoryQ3.createBrake().brake();
        factoryQ3.createEngine().engine();
        System.out.println("-----------------------");
        CarFactory factoryQ7 = new Q7Factory();
        factoryQ7.createTire().tire();
        factoryQ7.createBrake().brake();
        factoryQ7.createEngine().engine();
    }
}
