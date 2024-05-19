package cn.webrtclive.service.impl;

import cn.webrtclive.domain.User;
import cn.webrtclive.service.UserService;

public class UserServiceIpml implements UserService {

    @Override
    public void save(User user) {
        System.out.println("user save service ...");
    }


    @Override
    public User findByUsername(String username) {
        return null;
    }
}
