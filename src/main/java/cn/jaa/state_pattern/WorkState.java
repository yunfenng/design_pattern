package cn.jaa.state_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/14
 */
@Slf4j
public class WorkState extends AbstractState {
    @Override
    public void action(Context context) {
        log.info("state change to work state ...");
        log.info("work state actions is meeting, design, coding ...");
    }
}
