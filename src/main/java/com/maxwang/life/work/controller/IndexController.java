package com.maxwang.life.work.controller;

import com.maxwang.life.work.mapper.UserMapper;
import com.maxwang.life.work.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
/*    @GetMapping ("/hello")
    public String hello (@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }*/
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String index(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) { //输入 cookies.for 自动匹配格式
            if(cookie.getName().equals("token")){
                String token = cookie.getValue();
                User user = userMapper.findByToken(token); //alt + enter 创建方法 一直回车 会以驱动编程方式创建方法
                if (user != null){
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }
        //request.getSession().setAttribute("user", user);
        return "index";
    }
}

