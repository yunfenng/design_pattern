package cn.jaa.decorator_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description: 装饰者模式
 * @Date 2023/11/29 23:26
 */
@Slf4j
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void createComputer() {
        source.createComputer();
        // 创建完电脑后安装系统
        log.info("make Win 10 system...");
    }
}
