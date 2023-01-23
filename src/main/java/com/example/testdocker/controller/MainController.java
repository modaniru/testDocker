package com.example.testdocker.controller;

import com.example.testdocker.model.Entity;
import com.example.testdocker.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class MainController {
    @Autowired
    private EntityService entityService;

    @GetMapping("/main")
    public String mainPage(Model model){
        Entity entity = new Entity();
        model.addAttribute("entity", entity);
        return "main.html";
    }

    @PostMapping("/entity")
    public String testPage(@ModelAttribute("entity") Entity entity, Model model){
        System.out.println(entity);
        entityService.save(entity);
        model.addAttribute("entity", entityService.getById(entity.getId()));
        return "test.html";
    }

    @GetMapping("/entity/{id}")
    public String getById(@PathVariable("id") Integer id, Model model){
        model.addAttribute("entity", entityService.getById(id));
        return "test.html";
    }

}
