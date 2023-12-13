package cn.jaa.memento_pattern;

/**
 * @Author: Jaa
 * @Description: 备忘录类
 * @Date 2023/12/13
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
