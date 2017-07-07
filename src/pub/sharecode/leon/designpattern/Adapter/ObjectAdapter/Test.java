package pub.sharecode.leon.designpattern.Adapter.ObjectAdapter;

/**
 * 对象适配器测试
 *
 * @author leon
 * @version 1.0, 2017-07-07.
 */
public class Test {
    public static void main(String[] args) {
        VoltAdapter voltAdapter = new VoltAdapter(new Volt220());
        System.out.println("输出电压:" + voltAdapter.getVolt5());
    }
}
