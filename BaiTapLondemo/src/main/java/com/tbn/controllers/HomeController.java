/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tbn.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ADMINIS
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name", "BAO va NGAN");
        return "index";
        
    }
}
