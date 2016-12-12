package com.github.demo.web.controller;

import com.github.demo.model.UserModel;
import com.github.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhuoshangyi on 2016/12/10.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    protected static final String CONTENT_TYPE = "application/json;charset=UTF-8";

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/allUsers", method = RequestMethod.GET,produces = CONTENT_TYPE)
    @ResponseBody public List<UserModel>
    getUsers(){
        return userService.getAllUsers();
    }
}