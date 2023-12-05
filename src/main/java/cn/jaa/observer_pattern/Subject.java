package cn.jaa.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jaa
 * @date : 2023-12-04
 * @description: 抽象被观察者角色：持有订阅了该主题的观察者对象的集合，同时提供了增加、删除观察者对象的方法和主题状态发生变化后的通知方法。
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver(String message);
}