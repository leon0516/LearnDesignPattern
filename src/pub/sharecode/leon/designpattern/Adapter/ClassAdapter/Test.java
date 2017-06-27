package pub.sharecode.leon.designpattern.Adapter.ClassAdapter;

/**
 * 测试用例
 *
 * @author leon
 * @version 1.0, 2017-06-27.
 */
public class Test {
    public static void main(String[] args) {
        VoltAdapter voltAdapter = new VoltAdapter();
        System.out.println("输出电压:" + voltAdapter.getVolt5());
    }
}
