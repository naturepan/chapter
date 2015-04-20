package com.smart.dao;

import com.smart.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by Administrator on 2015/3/26.
 */
@Repository
public class LoginLogDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
 public void insertLoginLog(LoginLog loginLog){
    String strSql = "insert into t_loginlog(user_id,ip,login_log_Date) values(?,?,?) ";
     jdbcTemplate.update(strSql,new Object[]{
         loginLog.getUserId(), loginLog.getIp(),loginLog.getLoginDate()
     });
 }
}
