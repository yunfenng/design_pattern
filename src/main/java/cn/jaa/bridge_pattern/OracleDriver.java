package cn.jaa.bridge_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/30
 */
@Slf4j
public class OracleDriver implements Driver {
    @Override
    public void executeSQL() {
      log.info("execute sql by oracle driver...");
    }
}
