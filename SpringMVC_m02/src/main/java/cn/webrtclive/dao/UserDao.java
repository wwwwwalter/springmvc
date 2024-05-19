package cn.webrtclive.dao;

import cn.webrtclive.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Insert("insert into user(name,age) values(#{name},#{age})")
    public void save(User user);

    @Select("select * from user where username=#{name}")
    public User findByName(String name);
}
