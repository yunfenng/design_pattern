package cn.jaa.abstract_factory_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/27 22:51
 */
public abstract class AbstractFactory {
    public abstract Phone createPhone(String brand);
    public abstract Computer createComputer(String brand);
}
