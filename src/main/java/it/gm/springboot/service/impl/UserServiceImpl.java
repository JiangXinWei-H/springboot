package it.gm.springboot.service.impl;

import it.gm.springboot.dao.UserDao;
import it.gm.springboot.pojo.User;
import it.gm.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;


    @Override
    public int addUser(User user) {
        return this.userDao.addUser(user);
    }

    @Override
    public int delUser(Integer id) {
        return this.userDao.delUser(id);
    }

    @Override
    public int updUser(User user) {
        return this.userDao.updUser(user);
    }

    @Override
    public User findUserById(Integer id) {
        return this.userDao.findUserById(id);
    }

    @Override
    public List<User> findAll() {
        return this.userDao.findAll();
    }
}
