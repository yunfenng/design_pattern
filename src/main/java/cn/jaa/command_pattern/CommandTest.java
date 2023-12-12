package cn.jaa.command_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/12
 */
public class CommandTest {

    public static void main(String[] args) {
        // 定义命令的接收者和执行者
        Receiver receiver = new Receiver();
        // 命令实现者
        ConcreteCommand command = new ConcreteCommand(receiver);
        // 定义命令调用者
        Invoker invoker = new Invoker(command);
        // 调用命令
        invoker.action("cmd");
    }
}
