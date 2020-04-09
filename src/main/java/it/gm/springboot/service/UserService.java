package it.gm.springboot.service;

import it.gm.springboot.pojo.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    int delUser(Integer id);

    int updUser(User user);

    User findUserById(Integer id);

    List<User> findAll();
}
