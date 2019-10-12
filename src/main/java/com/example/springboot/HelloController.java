package com.example.springboot;

import com.example.springboot.model.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private PersonProperties personProperties;

    @RequestMapping("/hello")
    public JSONObject hello() {
        JSONObject result = new JSONObject();
        result.put("code", 200);
        result.put("msg", "");
        result.put("data", personProperties);
        return result;
    }
}

