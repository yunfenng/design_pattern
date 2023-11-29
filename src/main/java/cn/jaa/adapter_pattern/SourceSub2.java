package cn.jaa.adapter_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/29 22:41
 */
@Slf4j
public class SourceSub2 extends AbstractAdapter {
    @Override
    public void editWordFile() {
        log.info("a word file editing...");
    }
}
