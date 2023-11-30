package cn.jaa.proxy_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/30
 */
@Slf4j
public class HR implements Company {
    @Override
    public void findWorker(String title) {
        log.info("I need a worker, title is " + title);
    }
}
