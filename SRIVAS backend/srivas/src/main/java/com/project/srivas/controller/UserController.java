package com.project.srivas.controller;

import com.project.srivas.bean.UserBean;
import com.project.srivas.model.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserDAO dao;
    @PostMapping("/addUser")
    public String addData(@RequestBody UserBean user){
        dao.save(user);
        return "Added user with id" + user.get_id();
    }

    @GetMapping("/getData")
    public List<UserBean> getData(){
        return dao.findAll();
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hrey";
    }


}
