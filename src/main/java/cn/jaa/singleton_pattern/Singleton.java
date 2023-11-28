package cn.jaa.singleton_pattern;

/**
 * @Author: Jaa
 * @Description: 静态内部类
 * @Date 2023/11/28 21:03
 */
public class Singleton {

    public static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {}

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
