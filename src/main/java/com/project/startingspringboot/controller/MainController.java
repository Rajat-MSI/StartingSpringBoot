package com.project.startingspringboot.controller;

import com.project.startingspringboot.entity.User;
import com.project.startingspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.UUID;

@Controller
public class MainController
{
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/home")
    public String home()
    {
       return "home";
    }

    @RequestMapping(path = "/register-user",method = RequestMethod.POST)
    public RedirectView userMessage(@ModelAttribute("user") User user)
    {
        RedirectView redirectView = new RedirectView();
        user.getUserContact().setContactId(user.getUserId());
        userService.saveUser(user);
        System.out.println("user added");
        redirectView.setUrl("home");
        return redirectView;
    }
}
