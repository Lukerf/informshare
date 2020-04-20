package com.yxg.informshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Author xiguang_yin
 * @Date 2020/4/20 19:29
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{

//        request.getRequestDispatcher("login.html").forward(request, response);;
        ModelAndView mav = new ModelAndView("index");

        return mav;
    }
}
