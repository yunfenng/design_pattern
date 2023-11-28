package cn.jaa.builder_pattern;

import java.util.logging.Logger;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/28 21:37
 */
public class BuildComputerTest {

    private static final Logger log = Logger.getLogger(String.valueOf(BuildComputerTest.class));

    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        ComputerBuilder computerBuilder = new ComputerConcreteBuilder();
        Computer computer = computerDirector.constructComputer(computerBuilder);
        log.info(computer.getCpu());
        log.info(computer.getMemory());
        log.info(computer.getDisk());
    }
}
