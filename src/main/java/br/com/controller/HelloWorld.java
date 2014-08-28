package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

    @RequestMapping("/")
    public String loadHomePage(Model m) {
        m.addAttribute("name", "World");
        return "home";
    }
}
