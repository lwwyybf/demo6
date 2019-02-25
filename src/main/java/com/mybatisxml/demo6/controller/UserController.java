package com.mybatisxml.demo6.controller;




import com.mybatisxml.demo6.model.User;
import com.mybatisxml.demo6.service.UserServcie;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserServcie userServcie;

    @RequestMapping("/select")
    @ResponseBody
    public List<User> findAll() {
        return userServcie.findAll();
    }

    @RequestMapping("/index")
    public String index() {
        return "register";
    }

    @RequestMapping("/insert")
    public String insertUser(String name, String password, String email) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setEmail(email);
        userServcie.insertUser(user);
        return "apikey";
    }

    @RequestMapping("/tologin")
    public String tologin() {
        return "login";
    }

    @RequestMapping("/toindex")
    public String toindex() {
        return "index_active";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping(value = "/Home/GetJson",method= RequestMethod.POST)
    public String insertJson(@RequestBody String json) throws IOException {
        return "";
    }

}
