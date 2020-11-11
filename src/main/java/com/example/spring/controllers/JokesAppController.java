package com.example.spring.controllers;


import com.example.spring.services.JokeAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesAppController {

    private  JokeAppService jokeAppService;
    @Autowired
    public JokesAppController(JokeAppService jokeAppService) {
        this.jokeAppService = jokeAppService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
       model.addAttribute("jokes",jokeAppService.jokeReturn());
        return "chucknorris";
    }
}
