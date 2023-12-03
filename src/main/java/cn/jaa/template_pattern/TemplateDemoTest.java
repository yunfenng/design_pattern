package cn.jaa.template_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/3 17:39
 */
@Slf4j
public class TemplateDemoTest {

    public static void main(String[] args) {
        Dish eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.doDish();
        log.info("-------------------------");
        Dish pepperWithPork = new PepperWithPork();
        pepperWithPork.doDish();
    }
}
