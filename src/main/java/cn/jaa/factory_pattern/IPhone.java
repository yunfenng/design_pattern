package cn.jaa.factory_pattern;

/**
 * @Author: Jaa
 * @Date: 2023/11/27 21:33
 */
public class IPhone implements Phone {

    @Override
    public String brand() {
        return "This is a Apple phone.";
    }
}
