package cn.jaa.memento_pattern;

/**
 * @Author: Jaa
 * @Description: 备忘录管理类
 * @Date 2023/12/13
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
