package com.litan.web.controller;

import com.litan.domain.User;
import com.litan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }


    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public User findById(Integer id) {
        return userService.findById(id);
    }

    /**
     * 更新用户
     * @param user
     */
    @RequestMapping("/update")
    public void update(@RequestBody User user) {
        User user1 = userService.findById(user.getId());
        if (user1 != null) {
            user1.setAge(user.getAge());
            user1.setUsername(user.getUsername());
            user1.setPassword(user.getPassword());
            user1.setEmail(user.getEmail());
            user1.setSex(user.getSex());
            userService.update(user1);
        }
    }

    /**
     * 添加用户
     * @param user
     */
    @RequestMapping("/save")
    public void save(@RequestBody User user) {
        userService.save(user);
    }
}
