package ca.vrg_online.app.controllers;

import ca.vrg_online.app.services.TalonDePayeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {


    public HomeController(TalonDePayeService talonDePayeService) {

    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
