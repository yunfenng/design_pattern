package cn.jaa.iterator_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/5 23:02
 */
public interface Collection {
    // 对集合元素的迭代
    public Iterator iterator();
    // 获取集合元素
    public Object get(int i);
    // 向添加元素
    public boolean add(Object obj);
    // 获取集合的大小
    public int size();
}
