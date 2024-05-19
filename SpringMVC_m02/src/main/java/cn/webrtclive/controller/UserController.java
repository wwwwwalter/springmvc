package cn.webrtclive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user save ...");
        return "{'module':'springmvc'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        System.out.println("user delete ...");
        return "{'module':'springmvc'}";
    }

    @RequestMapping("/select")
    @ResponseBody
    public String select() {
        System.out.println("user select ...");
        return "{'module':'springmvc'}";

    }
}
