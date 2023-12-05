package cn.jaa.observer_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : Jaa
 * @date : 2023-12-04
 * @description: 具体观察者角色: 抽象观察者的实现类，在收到主题状态变化的信息后执行具体的触发机制
 */
@Slf4j
public class ConcreteObserver implements Observer {
    @Override
    public void dataChange(String message) {
        log.info("receive message: " + message);
    }
}