package cn.jaa.bridge_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/30
 */
public class BridgeDemoTest {

    public static void main(String[] args) {
        DriverManagerBridge driverBridge = new MyDriverBridge();
        // set MySQL driver
        driverBridge.setDriver(new MySQLDriver());
        driverBridge.execute();
        // switch Oracle driver
        driverBridge.setDriver(new OracleDriver());
        driverBridge.execute();
    }
}
