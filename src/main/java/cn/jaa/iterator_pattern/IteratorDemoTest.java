package cn.jaa.iterator_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/5 23:19
 */
@Slf4j
public class IteratorDemoTest {

    public static void main(String[] args) {
        Collection collection = new ListCollection();
        collection.add("obj1");
        collection.add("obj2");
        collection.add("obj3");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            log.info((String) it.next());
        }
    }
}
