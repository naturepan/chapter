package com.smart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2015/3/26.
 */
@ContextConfiguration(locations={"/applicationContext.xml"})
public class UserServiceTest extends AbstractTestNGSpringContextTests{
@Autowired
private UserService userService;
    @Test
public void hasUserMatchUser(){
    Boolean b1 = userService.hasMatchedUser("zhang1","1111");
    assert(b1);
}
}
