package com.smart.dao;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2015/3/26.
 */
@Repository
public class UserDao {
@Autowired
private JdbcTemplate jdbcTemplate;

public int getMatchCount(String userName,String password){
    String strSql = "select count(*) from hib.t_user where user_name=? and password=?";
    int matchCount = jdbcTemplate.queryForInt(strSql,new Object[]{userName,password});
    return matchCount;
}

public User findUserByUserName(final String userName){
    String strSql = "select user_name,user_id from t_user where user_name =? ";
    final User user  = new User();
    jdbcTemplate.query(strSql,new Object[]{userName},new RowCallbackHandler() {
        @Override
        public void processRow(ResultSet resultSet) throws SQLException {
            user.setUserId(resultSet.getInt("user_id"));
            user.setUserName(userName);
        }
    });
    return user;
}

public void updateLoginInfo(User user){
    String strSql = "update t_user set last_visit =?,last_ip=? where user_id=? ";
    jdbcTemplate.update(strSql,new Object[]{
            user.getLastVisit(),user.getLastIp(),user.getUserId()
    });
}
}
