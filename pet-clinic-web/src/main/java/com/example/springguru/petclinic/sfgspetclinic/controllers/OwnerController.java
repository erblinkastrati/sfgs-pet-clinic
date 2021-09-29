package com.example.springguru.petclinic.sfgspetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

//    use this when no request mapping at top
//    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
//    with the request mapping on top we can use this:
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }

}
