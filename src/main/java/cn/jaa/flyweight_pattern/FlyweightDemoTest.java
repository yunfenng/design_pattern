package cn.jaa.flyweight_pattern;

/**
 * @Author: Jaa
 * @Description: 测试享元模式
 * @Date 2023/12/2
 */
public class FlyweightDemoTest {

    public static void main(String[] args) {
        Memory memory = MemoryFactory.getMemory(64);
        MemoryFactory.releaseMemory(memory.getId());
        MemoryFactory.getMemory(64);
    }
}
