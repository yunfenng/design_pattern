package cn.jaa.observer_pattern;

/**
 * @author : Jaa
 * @date : 2023-12-04
 * @description: 抽象窜擦着角色：定义了主题状态发生变化时需要调用的方法
 */
public interface Observer {
    void dataChange(String message);
}