package com.ingy.toutiao.controller;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping(path = {"/", "/index"})
    @ResponseBody
    public String index() {
        return "Hello Ingy";
    }

    @RequestMapping(value = {"/profile/{groupId}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("groupId") String groupId,
                          @PathVariable("userId") int userId,
                          @RequestParam(value = "type", defaultValue = "1") int type,
                          @RequestParam(value = "key", defaultValue = "ingy") String key) {
        return String.format("GID{%s},UID{%d},TYPE{%d},KEY{%s}", groupId, userId, type, key);
    }

    @RequestMapping(value = {"/vm"})
//    public String news(Model model) {
    public String news() {
//        model.addAttribute("value1", "vv1");
//        List<String> colors = Arrays.asList(new String[]{"RED", "GREEN", "BLUE"});
//
//        Map<String, String> map = new HashMap<String, String>();
//        for (int i = 0; i < 4; ++i) {
//            map.put(String.valueOf(i), String.valueOf(i * i));
//        }
//
//        model.addAttribute("colors", colors);
//        model.addAttribute("map", map);
//        model.addAttribute("user", new User("Jim"));

        return "news";
    }

}
