package cn.jaa.abstract_factory_pattern;

import java.util.logging.Logger;

/**
 * @Author: Jaa
 * @Description: 抽象工厂模式测试
 * @Date 2023/11/27 23:01
 */
public class AbstractFactoryDemoTest {

    private static final Logger log = Logger.getLogger(String.valueOf(AbstractFactoryDemoTest.class));

    public static void main(String[] args) {
        AbstractFactory computerFactory = new ComputerFactory();
        Computer macbook = computerFactory.createComputer("Apple");
        Computer matebook = computerFactory.createComputer("Huawei");
        log.info(macbook.internet());
        log.info(matebook.internet());

        AbstractFactory phoneFactory = new PhoneFactory();
        Phone apple = phoneFactory.createPhone("Apple");
        Phone huawei = phoneFactory.createPhone("Huawei");
        log.info(apple.call());
        log.info(huawei.call());
    }
}
