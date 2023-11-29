package cn.jaa.adapter_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description: 对象适配器
 * @Date 2023/11/29 22:32
 */
@Slf4j
public class ObjectAdapter implements Targetable {

    private Source source;

    public ObjectAdapter(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void editTextFile() {
        this.source.editTextFile();
    }

    @Override
    public void editWordFile() {
        log.info("a word file editing...");
    }
}
