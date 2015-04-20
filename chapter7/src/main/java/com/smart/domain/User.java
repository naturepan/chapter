package com.smart.domain;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

/**
 * Created by Administrator on 2015/4/7.
 */
public class User {
@Pattern(regexp="w{4,30}")
private String userName;

@Length(min=2,max=3)
private String passWord;

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
}
