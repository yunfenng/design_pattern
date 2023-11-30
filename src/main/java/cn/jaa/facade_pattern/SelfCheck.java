package cn.jaa.facade_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/30
 */
@Slf4j
public class SelfCheck {
    public void startup() {
        log.info("SelfCheck startup...");
    }

    public void shutdown() {
        log.info("SelfCheck shutdown...");
    }
}
