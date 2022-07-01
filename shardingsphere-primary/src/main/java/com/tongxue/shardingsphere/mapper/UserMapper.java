package com.tongxue.shardingsphere.mapper;

import com.tongxue.shardingsphere.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {


    @Insert("insert into ksd_user(nickname,age,password,sex,birthday) values(#{nickname},#{age},#{password},#{sex},#{birthday})")
    void addUser(User user);

    @Select("select * from ksd_user")
    List<User> findUsers();
}
