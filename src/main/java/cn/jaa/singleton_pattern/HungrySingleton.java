package cn.jaa.singleton_pattern;

/**
 * @Author: Jaa
 * @Description: 饿汉式模式
 * @Date 2023/11/28 20:53
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
