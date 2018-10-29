package com.litan.dao;

import com.litan.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {
    /**
     *查询表所有信息
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    @Select("select * from user where id=#{id}")
    User findById(Integer id);

    /**
     * 修改用户信息
     * @param user
     */
    @Update("update user set age=#{age},username=#{username},password=#{password},email=#{email},sex=#{sex} where id=#{id}")
    void update(User user);

    /**
     * 添加用户信息
     * @param user
     */
    @Insert("insert into user values(#{id},#{age},#{username},#{password},#{email},#{sex})")
    void save(User user);
}
