package cn.jaa.state_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/14
 */
@Slf4j
public class HolidayState extends AbstractState {
    @Override
    public void action(Context context) {
        log.info("state change to holiday state ...");
        log.info("holiday state actions is travel, shopping, watch TV ...");
    }
}

