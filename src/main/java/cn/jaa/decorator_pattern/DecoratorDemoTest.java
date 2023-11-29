package cn.jaa.decorator_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/29 23:29
 */
public class DecoratorDemoTest {

    public static void main(String[] args) {
        Source source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.createComputer();
    }
}
