package cn.jaa.command_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/12
 */
@Slf4j
public class Receiver {
    public void action(String commandMsg) {
        log.info("received command and execute command ...");
    }
}
