package cn.jaa.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jaa
 * @Description: Collection接口实现类ListCollection
 * @Date 2023/12/5 23:07
 */
public class ListCollection implements Collection {

    public List list = new ArrayList();

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public Object get(int i) {
        return list.get(i);
    }

    @Override
    public boolean add(Object obj) {
        list.add(obj);
        return true;
    }

    @Override
    public int size() {
        return list.size();
    }
}
