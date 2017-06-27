package pub.sharecode.leon.designpattern.Adapter.ClassAdapter;

/**
 * 将220V转换成5V(Adapter角色)
 *
 * @author leon
 * @version 1.0, 2017-06-27.
 */
public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        return 5;
    }
}
