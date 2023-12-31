package cn.jaa.iterator_pattern;

/**
 * @Author: Jaa
 * @Description: Iterator的实现类ConcreteIterator
 * @Date 2023/12/5 23:10
 */
public class ConcreteIterator implements Iterator {

    private Collection collection;
    // 当前迭代器遍历到的元素位置
    private int pos = -1;

    public ConcreteIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if (pos > 0) {
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if (pos < collection.size() - 1) {
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if (pos < collection.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
