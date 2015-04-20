package com.smart.web;

import com.smart.domain.User;
import com.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Administrator on 2015/3/27.
 */
@Controller
@RequestMapping(value = "/admin")
public class LoginController {
@Autowired
private UserService userService;

    @RequestMapping(value="/login.html")
    public String loginPage(){
        return "login";
    }


    @RequestMapping(value="/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request,LoginCommand loginCommand){
    boolean  b = userService.hasMatchedUser(loginCommand.getUserName(),loginCommand.getPassWord());
/*    if(!b){
        return new ModelAndView("login","error","用户不存在");
    }*/
        System.out.println("loginCommand.getUserName()"+"--"+loginCommand.getUserName());
        System.out.println("loginCommand.getPassWord()"+"--"+loginCommand.getPassWord());
    User user = userService.findByUserName(loginCommand.getUserName());
        user.setLastIp(request.getRemoteAddr());
        user.setLastVisit(new Date());
        userService.loginSuccess(user);
        request.getSession().setAttribute("user",user);
        return new ModelAndView("main");
    }
}
