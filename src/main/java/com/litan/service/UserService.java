package com.litan.service;

import com.litan.domain.User;

import java.util.List;

public interface UserService {
    /**
     *查询表所有信息
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * 修改用户信息
     * @param user
     */
    void update(User user);

    /**
     * 添加用户信息
     * @param user
     */
    void save(User user);
}
