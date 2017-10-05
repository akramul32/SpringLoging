/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idb.controller;

import com.idb.daoi.UsersDao;
import com.idb.pojo.Users;
import org.springframework.ui.ModelMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author DOLPHIN
 */
@Controller
public class UserController {
    
    @Autowired
    UsersDao dao;
    
    @RequestMapping(value = "/")
    public String homePage(){
    
    return "index";
    }
    @RequestMapping(value = "/regester")
    public String regPage(){
    
    return "regester";
    }
    
    
    @RequestMapping(value = "/createuser", method = RequestMethod.POST)
    public String createUser(ModelMap map,@ModelAttribute Users u){
    boolean bool=dao.createUser(u);
    
        if (bool) {
            map.addAttribute("sm", "User Created SuccessFully");
            return "index";
        } else {
             map.addAttribute("em", "User not Created");
            return "regester";
        }
    
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String createLogin(ModelMap map,@ModelAttribute Users u){
    boolean bool=dao.userLogin(u);
    
        if (bool) {
            map.addAttribute("sm", "Login SuccessFully");
            return "success";
        } else {
             map.addAttribute("em", "Login Failed");
            return "index";
        }
    
    }
    
}
