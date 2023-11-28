package cn.jaa.abstract_factory_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/27 22:59
 */
public class ComputerFactory extends AbstractFactory{
    @Override
    public Phone createPhone(String brand) {
        return null;
    }

    @Override
    public Computer createComputer(String computerName) {
        if ("Apple".equals(computerName)) {
            return new ComputerApple();
        } else if ("Huawei".equals(computerName)) {
            return new ComputerHuawei();
        } else {
            return null;
        }
    }
}
