package cn.jaa.template_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description: 辣椒炒肉
 * @Date 2023/12/3 17:41
 */
@Slf4j
public class PepperWithPork extends Dish {
    @Override
    public void preparation() {
        log.info("切猪肉，辣椒，准备配料 ...");
    }

    @Override
    public void doing() {
        log.info("倒油红锅，加小料炒香放入pork炒熟加配料，炒匀 ...");
    }

    @Override
    public void carriedDishes() {
        log.info("将炒好的 PepperWithPork 出锅放入盘，端给客人 ...");
    }
}
