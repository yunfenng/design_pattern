package cn.jaa.singleton_pattern;

/**
 * @Author: Jaa
 * @Description: 双重校验锁
 * @Date 2023/11/28 21:07
 */
public class Lock2Singleton {

    // 对象锁
    private volatile static Lock2Singleton singleton;

    private Lock2Singleton() {}

    public static Lock2Singleton getInstance() {
        if (singleton == null) {
            // synchronized方法锁
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Lock2Singleton();
                }
            }
        }
        return singleton;
    }

}
