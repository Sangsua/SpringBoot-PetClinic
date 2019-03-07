package de.springframework.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index","/vets/index.html","/vets.html"})
    public String getVets(){
        return "vets/index";
    }

}
