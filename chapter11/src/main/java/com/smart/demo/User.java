package com.smart.demo;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2015/4/17.
 */
@Entity
@Table(name="t_user")
public class User extends  BaseDemo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    protected  int userId;

    @Column(name="user_name")
    protected  String userName;

    @Column(name="password")
    protected  String passWord;

    @Column(name="createdate")
    protected Date createDate;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
