package com.zd.zdinterface.controller;

import com.zd.zdinterface.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * 查询名称
 * @author zd
 */
@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/")
    public  String getNameByGet(String name) {
        return "GET 你的名字是：" + name;
    }
    @PostMapping("/")
    public  String getNameByPost(@RequestParam String name) {
        return "Post 你的名字是：" + name;
    }
    @PostMapping("/user")
    public  String getUserNameBy(@RequestBody User user) {
        return user.getUsername();
    }
}
