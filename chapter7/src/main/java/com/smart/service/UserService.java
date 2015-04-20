package com.smart.service;

import com.smart.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/4/14.
 */
@Service
public class UserService {

 public boolean  loginCheck(String userName,String passWord){
     if(!userName.equalsIgnoreCase("admin")||!passWord.equalsIgnoreCase("1234")){
       return false;
     }
     return true;
 }
}
