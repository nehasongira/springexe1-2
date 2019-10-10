package com.stackroute.controller;
import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @PostMapping("/show")
    public ModelAndView getName(HttpServletRequest req){
        String str=req.getParameter("name");
        User user=new User();
        user.setName(str);
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("value",str);
        return  modelAndView;
    }
}
