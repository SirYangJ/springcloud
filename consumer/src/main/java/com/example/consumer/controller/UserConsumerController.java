package com.example.consumer.controller;

import com.example.consumer.pojo.User;
import com.example.consumer.remote.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserConsumerController {
    @Autowired
    private UserRemote userRemote;

    @RequestMapping("/hello")
    public Map<Object, Object> query(@RequestBody User user) {
        Map map = userRemote.queryById(user);
        return map;
    }

}
