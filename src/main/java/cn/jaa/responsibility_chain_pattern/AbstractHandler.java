package cn.jaa.responsibility_chain_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/11
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
