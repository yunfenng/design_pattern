package cn.jaa.proxy_pattern;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/30
 */
@Slf4j
public class Proxy implements Company {

    private HR hr;

    public Proxy() {
        this.hr = new HR();
    }

    @Override
    public void findWorker(String title) {
        hr.findWorker(title);
        // 通过猎头找候选人
        String worker = getWorker(title);
        log.info("find a worker by proxy, name is " + worker);
    }

    private String getWorker(String title) {
        Map<String, String> workerList = new HashMap<>() {
            {
                put("Java", "张三");
                put("Go", "李四");
                put("Python", "王五");
            }
        };
        return workerList.get(title);
    }
}
