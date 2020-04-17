package com.yxg.informshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Author xiguang_yin
 * @Date 2020/4/17 12:15
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ModelAndView mav = new ModelAndView("test");
        return mav;
    }
}
