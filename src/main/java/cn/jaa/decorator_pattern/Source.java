package cn.jaa.decorator_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/29 23:25
 */
@Slf4j
public class Source implements Sourceable {
    @Override
    public void createComputer() {
        log.info("create computer by source...");
    }
}
