package com.smart.controller;

import com.smart.domain.LoginCommond;
import com.smart.domain.User;
import com.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/4/7.
 */

@Controller
@RequestMapping(value = "/admin")
public class LoginController {
   @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public User getUser(){
       User user = new User();
        user.setUserName("spring test1");
        return user;
    }
    public void createUser(User user){
        System.out.println("username="+user.getUserName());
    }

    @RequestMapping(value="/login.html")
    public String loginPage(){
        System.out.println("logintest");
        return "login";
    }

    @RequestMapping(value="/loginCheck.html")
    public String loginCheck(HttpServletRequest request,@Valid @ModelAttribute("user") User user,BindingResult bindingResult){
        boolean b = userService.loginCheck(user.getUserName(),user.getPassWord());
        System.out.println("username="+user.getUserName());
        System.out.println("password="+user.getPassWord());
        System.out.println("errors="+bindingResult.hasErrors());
        if(bindingResult.hasErrors()){
            return "regpage";
        }else{
            return "success";
        }
    }
    @RequestMapping(value="/servlet1")
    public String  servlet1(HttpSession httpSession){
        System.out.println("id="+httpSession.getId());
        return "success";
    }

    @RequestMapping(value="/servlet2")
    public ModelAndView servlet2(HttpServletResponse response){
        LoginCommond loginCommond = new LoginCommond();
        loginCommond.setUserName("zhangsan");
        ModelAndView mv = new ModelAndView("success");
        mv.addObject(loginCommond);
        return mv;
    }

    @RequestMapping(value="/servlet3")
    @ResponseBody
    public String servlet3(){
        return "spring test";
    }

    /**
     * spring验证
     * @param user
     * @param bindingResult
     * @return
     */
   @RequestMapping(value="/servlet4")
    public String validate(@Valid @ModelAttribute("user") User user,BindingResult bindingResult){
        System.out.println("validate name = "+user.getUserName());
       System.out.println("validate password = "+user.getPassWord());
        if(bindingResult.hasErrors()){
            return "regpage";
        }else{
            return "success";
        }
    }

    /**
     * spring  视图  jstl
     */
    @RequestMapping(value="/jstlView")
    public String jstlView(ModelMap map){
        List<User> users = new ArrayList<User>();
        User user1 = new User();
        user1.setUserName("张三");
        user1.setPassWord("123456");
        User user2 = new User();
        user2.setUserName("李四");
        user2.setPassWord("654321");
        users.add(user1);
        users.add(user2);
        map.addAttribute("userList",users);
        return "userlist";
    }

    /**
     * 地址带参数
     * @param userName
     * @return
     */
    @RequestMapping(value="/user/showuser/{user.userName}")
    @ResponseBody
    public String showUser(@PathVariable("user.userName")String userName){
        return userName+"123";
    }

    /**
     * freemarker 视图
     * @param modelMap
     * @return
     */
    @RequestMapping(value="/ftlview")
   public String  showUserListFtl(ModelMap modelMap){
       List<User> users = new ArrayList<User>();
       User user1 = new User();
       user1.setUserName("张三");
       user1.setPassWord("123456");
       User user2 = new User();
       user2.setUserName("李四");
       user2.setPassWord("654321");
       users.add(user1);
       users.add(user2);
       modelMap.addAttribute("userList",users);
       return "userlistFtl";
   }


    @RequestMapping(value="/jsonview")
      public  @ResponseBody ModelMap showUserListByJson(ModelMap modelMap){
        List<User> users = new ArrayList<User>();
        User user1 = new User();
        user1.setUserName("张三");
        user1.setPassWord("123456");
        User user2 = new User();
        user2.setUserName("李四");
        user2.setPassWord("654321");
        users.add(user1);
        users.add(user2);
        modelMap.addAttribute("userList",users);
        return modelMap;
    }

    @RequestMapping(value="/uploadPage")
    public String uploadPage(){
        return "uploadPage";
    }

    @RequestMapping(value="/upload")
    public String upload(@RequestParam("name")String name,@RequestParam("file")MultipartFile file) throws IOException{
        if(!file.isEmpty()){
                System.out.println(file.getContentType());
                file.transferTo(new File("d:/temp/"+name));
                return  "success";
        }else{
                 return "fail";
        }
    }
}
