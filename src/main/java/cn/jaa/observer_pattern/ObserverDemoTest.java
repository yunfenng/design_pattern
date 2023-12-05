package cn.jaa.observer_pattern;

/**
 * @author : Jaa
 * @date : 2023-12-04
 * @description:
 */
public class ObserverDemoTest {

    public static void main(String[] args) {
        Observer observer = new ConcreteObserver();
        Subject subject = new ConcreteSubject();
        subject.add(observer);
        subject.notifyObserver("data");
    }
}