package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/pass-scope")
public class PassScopeController {

    @Autowired
    HttpSession session;

    @RequestMapping("")
    public String index(){
        return "pass-scope-form";
    }

    @RequestMapping("/input-address")
    public String inputAddress(String name, String name2){
 
         if (name.equals("aono@example.com") && name2.equals("passwordaono")) {
             
             session.setAttribute("name", name);
             session.setAttribute("name2", name2);
             return "result-pass-scope1";

         } else {
            
             return "pass-scope-form";
         }
    }

    @RequestMapping("/to-mypage")
    public String toMypage(){

        if(session.getAttribute("name") == null || session.getAttribute("name2") == null) {
            return "redirect:/pass-scope";
        }
        return "result-pass-scope2";
    }
}
