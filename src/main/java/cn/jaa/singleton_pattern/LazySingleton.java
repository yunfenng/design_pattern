package cn.jaa.singleton_pattern;

import java.util.Objects;

/**
 * @Author: Jaa
 * @Description: 懒汉模式
 * @Date 2023/11/28 20:47
 */
public class LazySingleton {

    // 私有的静态对象instance
    private static LazySingleton instance;

    // 构造方法
    private LazySingleton() {}

    // 加锁的静态方法获取该对象，加锁则线程安全
    public LazySingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
