package cn.jaa.facade_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/30
 */
@Slf4j
public class FacadeDemoTest {

    public static void main(String[] args) {
        Starter starter = new Starter();
        // 启动汽车
        starter.startup();
        // 熄灭汽车
        starter.shutdown();
    }
}
