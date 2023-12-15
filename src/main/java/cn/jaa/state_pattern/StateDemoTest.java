package cn.jaa.state_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/14
 */
public class StateDemoTest {

    public static void main(String[] args) {
        Context context = new Context(new WorkState());
        context.action();
        context.setState(new HolidayState());
        context.action();
    }
}
