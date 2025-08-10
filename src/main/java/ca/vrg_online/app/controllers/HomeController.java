package ca.vrg_online.app.controllers;

import ca.vrg_online.app.dto.TalonDePayeDto;
import ca.vrg_online.app.services.TalonDePayeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {


    private final TalonDePayeService talonDePayeService;

    public HomeController(TalonDePayeService talonDePayeService) {
        this.talonDePayeService = talonDePayeService;
    }

    @GetMapping("/")
    public String index(Model theModel) {

        List<TalonDePayeDto> talons = talonDePayeService.findAll();
        theModel.addAttribute("talons", talons);


        return "index";
    }
}
