package pub.sharecode.leon.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例模式
 *
 * @author leon
 * @version 1.0, 17-6-27.
 */
public class SingletonMap {
    private static Map<String, Object> objectMap = new HashMap<>();

    private SingletonMap() {
    }

    /**
     * 存储某一单例
     *
     * @param key      单例名
     * @param instance 单例
     */
    private void registerService(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    /**
     * 获取某一单例
     *
     * @param key 单例名字
     * @return 单例
     */
    private Object getService(String key) {
        return objectMap.get(key);
    }
}
