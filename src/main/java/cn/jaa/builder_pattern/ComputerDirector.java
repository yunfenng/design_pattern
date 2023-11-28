package cn.jaa.builder_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/28 21:35
 */
public class ComputerDirector {

    public Computer constructComputer(ComputerBuilder computerBuilder) {
        computerBuilder.buildCPU();
        computerBuilder.buildMemory();
        computerBuilder.buildDisk();
        return computerBuilder.buildComputer();
    }
}
