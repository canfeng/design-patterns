package art.yorm.design_patterns.structural.proxy_pattern.dynamic_proxy.cglib_proxy;

import art.yorm.design_patterns.structural.proxy_pattern.user.HomeController;
import art.yorm.design_patterns.structural.proxy_pattern.user.LoginController;

/**
 * 代理模式-CGLib动态代理
 */
public class _Test {

    public static void main(String[] args) {
        LoginController loginController = new LoginController();
        HomeController homeControllerProxy = (HomeController) new UserAuthenticationDynamicProxy(new HomeController()).newProxyInstance();

        loginController.login("szg","sss");
        homeControllerProxy.showIndex();
        loginController.login("szg11","sss");
        homeControllerProxy.showIndex();
        loginController.login("szg","sss");
        homeControllerProxy.showIndex();
    }
}
