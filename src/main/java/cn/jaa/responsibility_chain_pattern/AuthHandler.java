package cn.jaa.responsibility_chain_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description: 授权处理类
 * @Date 2023/12/11
 */
@Slf4j
public class AuthHandler extends AbstractHandler implements Handler {
    private String name;

    public AuthHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        log.info("user auth ...");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
