package cn.jaa.adapter_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description: 类适配器
 * @Date 2023/11/29 22:29
 */
@Slf4j
public class ClassAdapter extends Source implements Targetable {
    @Override
    public void editWordFile() {
        log.info("a word file editing...");
    }
}
