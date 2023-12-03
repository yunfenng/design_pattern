package cn.jaa.template_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description: 番茄炒鸡蛋
 * @Date 2023/12/3 17:35
 */
@Slf4j
public class EggsWithTomato extends Dish {
    @Override
    public void preparation() {
        log.info("洗切番茄，打鸡蛋，开火倒油 ...");
    }

    @Override
    public void doing() {
        log.info("倒入鸡蛋炒黄，加番茄加盐一起炒匀 ...");
    }

    @Override
    public void carriedDishes() {
        log.info("将炒好的 EggsWithTomato 放入盘，端给客人 ...");
    }
}
