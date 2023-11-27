package cn.jaa.factory_pattern;

import java.util.logging.Logger;


/**
 * @Author: Jaa
 * @Desc：工厂模式
 *
 * @Date: 2023/11/27 21:39
 */
public class FactoryDemo {

    private static final Logger log = Logger.getLogger(String.valueOf(FactoryDemo.class));

    public static void main(String[] args) {
        Factory factory = new Factory();
        Phone apple = factory.createPhone("Apple");
        Phone huawei = factory.createPhone("Huawei");
        log.info(apple.brand());
        log.info(huawei.brand());
    }
}
