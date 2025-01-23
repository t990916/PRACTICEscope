package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/practice-scope")
public class PracticeOneScopeController {

    @RequestMapping("")
    public String index(){
        return "request-practice-scope-form";
    }
    @RequestMapping("/input-sum")
public String inputSum(String sum, org.springframework.ui.Model model){
    model.addAttribute("sum", sum);

    return "result-request-practice-scope";
    }
}

