package com.yxg.informshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @Description TODO
 * @Author xiguang_yin
 * @Date 2020/4/14 21:50
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{

//        request.getRequestDispatcher("login.html").forward(request, response);;
        ModelAndView mav = new ModelAndView("login");

        return mav;
    }
}
