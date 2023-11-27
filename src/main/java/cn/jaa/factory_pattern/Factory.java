package cn.jaa.factory_pattern;

/**
 * @Author: Jaa
 * @Date: 2023/11/27 21:37
 */
public class Factory {

    public Phone createPhone(String phoneName) {
        if ("Apple".equals(phoneName)) {
            return new IPhone();
        } else if ("Huawei".equals(phoneName)) {
            return new Huawei();
        } else {
            return null;
        }
    }
}
