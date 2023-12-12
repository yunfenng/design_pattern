package cn.jaa.command_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/12
 */
@Slf4j
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(String commandMsg) {
        log.info("command sending ...");
        command.exe(commandMsg);
    }
}
