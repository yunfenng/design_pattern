package cn.jaa.iterator_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/5 23:08
 */
public interface Iterator {
    // 前移指针
    public Object previous();
    // 后移指针
    public Object next();
    public boolean hasNext();
}
