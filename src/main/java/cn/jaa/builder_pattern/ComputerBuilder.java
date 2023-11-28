package cn.jaa.builder_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/28 21:16
 */
public interface ComputerBuilder {
    void buildCPU();
    void buildMemory();
    void buildDisk();
    Computer buildComputer();
}
