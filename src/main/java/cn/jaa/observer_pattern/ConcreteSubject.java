package cn.jaa.observer_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : Jaa
 * @date : 2023-12-04
 * @description: 具体被观察者角色: ：实现了抽象主题的通知方法，在主题的内部状态发生变化时，调用该方法通知订阅了主题状态的观察者对象。
 */
@Slf4j
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observers) {
            log.info("notify observer " + message + "change ...");
            observer.dataChange(message);
        }
    }
}