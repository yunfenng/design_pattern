package cn.jaa.builder_pattern;

import cn.jaa.factory_pattern.FactoryDemo;
import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/28 21:18
 */
@Slf4j
public class ComputerConcreteBuilder implements ComputerBuilder {

    // private static final Logger log = Logger.getLogger(String.valueOf(ComputerConcreteBuilder.class));

    Computer computer;

    public ComputerConcreteBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildCPU() {
        log.info("build cpu...");
        computer.setCpu("16core");
    }

    @Override
    public void buildMemory() {
        log.info("build memory...");
        computer.setMemory("64G");
    }

    @Override
    public void buildDisk() {
        log.info("build disk...");
        computer.setDisk("1TG");
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}
