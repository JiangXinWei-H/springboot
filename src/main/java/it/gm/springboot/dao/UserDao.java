package it.gm.springboot.dao;

import it.gm.springboot.pojo.User;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface UserDao {

    @Insert("insert into tb_user(username,password) values(#{username},#{password})")
    int addUser(User user);

    int delUser(Integer id);

    int updUser(User user);

    User findUserById(Integer id);

    List<User> findAll();


}
