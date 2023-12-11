package cn.jaa.responsibility_chain_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/11
 */
public class ResponsibilityChainDemoTest {

    public static void main(String[] args) {
        AuthHandler authHandler = new AuthHandler("auth");
        BusinessHandler businessHandler = new BusinessHandler("buss");
        ResponseHandler responseHandler = new ResponseHandler("resp");
        authHandler.setHandler(businessHandler);
        businessHandler.setHandler(responseHandler);
        authHandler.operator();
    }
}
