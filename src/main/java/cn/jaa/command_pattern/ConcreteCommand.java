package cn.jaa.command_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/12
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe(String command) {
        receiver.action(command);
    }
}
