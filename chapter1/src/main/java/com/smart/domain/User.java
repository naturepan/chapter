package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2015/3/26.
 */
public class User implements Serializable {
    private int userId;
    private String userName;
    private String password;
    private String lastIp;
    private Date lastVisit;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getLastIp() {
        return lastIp;
    }

    public Date getLastVisit() {
        return lastVisit;
    }
}
