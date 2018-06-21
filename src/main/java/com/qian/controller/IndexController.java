package com.qian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qian
 * @date 2018/6/21
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public void index(){
        System.err.println("+++++++++++++++++++++++++++++++");
    }

}
