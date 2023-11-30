package cn.jaa.facade_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description: 启动按钮
 * @Date 2023/11/30
 */
@Slf4j
public class Starter {

    private Engine engine;
    private Dashboard dashboard;
    private SelfCheck selfCheck;

    public Starter() {
        this.engine = new Engine();
        this.dashboard = new Dashboard();
        this.selfCheck = new SelfCheck();
    }

    public void startup() {
        log.info("====car begin startup====");
        engine.startup();
        dashboard.startup();
        selfCheck.startup();
        log.info("====car startup finished====");
    }

    public void shutdown() {
        log.info("====car begin shutdown====");
        engine.shutdown();
        dashboard.shutdown();
        selfCheck.shutdown();
        log.info("====car shutdown finished====");
    }
}
