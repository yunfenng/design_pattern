package cn.jaa.memento_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/13
 */
@Slf4j
public class MementoDemoTest {

    public static void main(String[] args) {
        Original original = new Original("Jobs");
        Storage storage = new Storage(original.createMemento());
        log.info("original value : " + original.getValue());
        original.setValue("Jordan");
        log.info("updated value : " + original.getValue());
        original.restoreMemento(storage.getMemento());
        log.info("restore value : " + original.getValue());
    }
}
