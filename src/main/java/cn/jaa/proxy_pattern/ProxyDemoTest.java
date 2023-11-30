package cn.jaa.proxy_pattern;

/**
 * @Author: Jaa
 * @Description: 代理模式
 * @Date 2023/11/30
 */
public class ProxyDemoTest {

    public static void main(String[] args) {
        Company proxy = new Proxy();
        proxy.findWorker("Java");
    }
}
