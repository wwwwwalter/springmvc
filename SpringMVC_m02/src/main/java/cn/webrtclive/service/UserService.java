package cn.webrtclive.service;

import cn.webrtclive.domain.User;

public interface UserService {
    public void save(User user);
    public User findByUsername(String username);

}
