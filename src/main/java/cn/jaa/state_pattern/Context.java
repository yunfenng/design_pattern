package cn.jaa.state_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/14
 */
public class Context {
    private AbstractState state;

    public Context(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void action() {
        this.state.action(this);
    }
}
