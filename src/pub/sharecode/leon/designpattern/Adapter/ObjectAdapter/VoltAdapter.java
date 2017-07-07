package pub.sharecode.leon.designpattern.Adapter.ObjectAdapter;

/**
 * 对象适配器模式
 *
 * @author leon
 * @version 1.0, 2017-07-07.
 */
public class VoltAdapter implements FiveVolt {
    Volt220 volt220;

    public VoltAdapter(Volt220 adaptee) {
        this.volt220 = adaptee;
    }

    @Override
    public int getVolt5() {
        return 5;
    }

    /**
     * 获取220V电压
     *
     * @return 220v
     */
    public int getVolt220() {
        return volt220.getVolt220();
    }
}
