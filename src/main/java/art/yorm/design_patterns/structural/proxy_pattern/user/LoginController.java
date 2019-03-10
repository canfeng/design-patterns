package art.yorm.design_patterns.structural.proxy_pattern.user;

import art.yorm.design_patterns.structural.proxy_pattern.config.UserContextHolder;

public class LoginController {
    public void login(String userName, String pwd) {
        System.out.println("用户登录：" + userName);
        UserContextHolder.set(userName);
    }
}
