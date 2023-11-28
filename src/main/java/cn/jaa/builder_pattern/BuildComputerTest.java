package cn.jaa.builder_pattern;

import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/28 21:37
 */
@Slf4j
public class BuildComputerTest {

    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        ComputerBuilder computerBuilder = new ComputerConcreteBuilder();
        Computer computer = computerDirector.constructComputer(computerBuilder);
        log.info(computer.getCpu());
        log.info(computer.getMemory());
        log.info(computer.getDisk());
    }
}
