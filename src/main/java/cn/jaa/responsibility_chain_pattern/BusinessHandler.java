package cn.jaa.responsibility_chain_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description: 业务处理类
 * @Date 2023/12/11
 */
@Slf4j
public class BusinessHandler extends AbstractHandler implements Handler {

    private String name;

    public BusinessHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        log.info("business handler ...");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
