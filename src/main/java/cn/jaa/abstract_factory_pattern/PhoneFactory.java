package cn.jaa.abstract_factory_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/27 22:57
 */
public class PhoneFactory extends AbstractFactory{
    @Override
    public Phone createPhone(String phoneName) {
        if ("Apple".equals(phoneName)) {
            return new PhoneApple();
        } else if ("Huawei".equals(phoneName)) {
            return new PhoneHuawei();
        } else {
            return null;
        }
    }

    @Override
    public Computer createComputer(String brand) {
        return null;
    }
}
