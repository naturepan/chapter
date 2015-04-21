package com.smart.dao;

import com.smart.demo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2015/4/17.
 */
@Repository
public class UserDao extends  BaseDao<User> {
    public List<User> findByName(String userName){
        String hql = "from User user where user.userName like ?";
        String name = "%"+userName+"%";
        return this.find(hql,name);
    }

    public List<User> findByUser (User user){
        String hql = "from User user where user.userName=? and user.passWord=?";
        return this.find(hql,user.getUserName(),user.getPassWord());
    }
}
