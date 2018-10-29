package com.litan.service.impl;

import com.litan.dao.UserDao;
import com.litan.domain.User;
import com.litan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public void update(User user) {
        System.out.println(user);
        userDao.update(user);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }
}
