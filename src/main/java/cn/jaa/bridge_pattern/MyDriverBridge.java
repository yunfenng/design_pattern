package cn.jaa.bridge_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/30
 */
public class MyDriverBridge extends DriverManagerBridge {
    @Override
    public void execute() {
        getDriver().executeSQL();
    }
}
