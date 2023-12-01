package cn.jaa.bridge_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/30
 */
public abstract class DriverManagerBridge {

    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void execute() {
        this.driver.executeSQL();
    }
}
