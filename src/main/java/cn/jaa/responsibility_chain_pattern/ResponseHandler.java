package cn.jaa.responsibility_chain_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description: 结果反馈类
 * @Date 2023/12/11
 */
@Slf4j
public class ResponseHandler extends AbstractHandler implements Handler {

    private String name;

    public ResponseHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        log.info("response handler ...");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
