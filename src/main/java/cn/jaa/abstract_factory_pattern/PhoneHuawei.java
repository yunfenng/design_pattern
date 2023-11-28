package cn.jaa.abstract_factory_pattern;

/**
 * @Author:
 * @Description:
 * @Date 2023/11/27 22:48
 */
public class PhoneHuawei implements Phone {
    @Override
    public String call() {
        return "Call sb. by Huawei phone...";
    }
}