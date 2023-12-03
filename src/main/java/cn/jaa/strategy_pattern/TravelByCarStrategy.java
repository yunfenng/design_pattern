package cn.jaa.strategy_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/3 9:58
 */
@Slf4j
public class TravelByCarStrategy implements TravelStrategy {
    @Override
    public void travelMode() {
        log.info("travel by car ...");
    }
}
