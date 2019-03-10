package art.yorm.design_patterns.structural.proxy_pattern.user;

import art.yorm.design_patterns.structural.proxy_pattern.config.UserContextHolder;

public class HomeController {
    public void showIndex() {
        String userName = UserContextHolder.get();
        System.out.println("欢迎进入SZG的个人博客，当前用户：" + userName);
    }
}
