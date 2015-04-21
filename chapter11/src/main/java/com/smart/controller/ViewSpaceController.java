package com.smart.controller;

import com.smart.demo.ViewSpace;
import com.smart.service.ViewSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2015/4/21.
 */
@Controller
public class ViewSpaceController  extends BaseController{
    @Autowired
    private ViewSpaceService viewSpaceService;

    @RequestMapping(value = "spacelist")
    public String  find(ModelMap map){
    int userId = 1;
    List<ViewSpace> lists = viewSpaceService.findByUserId(userId);
    map.addAttribute("spacelist",lists);
    return "spacelist";
    }
}
