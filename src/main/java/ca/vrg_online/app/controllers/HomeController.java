package ca.vrg_online.app.controllers;

import ca.vrg_online.app.dto.TalonDePayeDto;
import ca.vrg_online.app.services.TalonDePayeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {


    private final TalonDePayeService talonDePayeService;

    public HomeController(TalonDePayeService talonDePayeService) {
        this.talonDePayeService = talonDePayeService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/talon/{id}")
    public String talon(@PathVariable Long id, Model theModel) {
        TalonDePayeDto talonDePayeDto = talonDePayeService.findById(id);
        theModel.addAttribute("talon", talonDePayeDto);

        return "talon";
    }

    @PostMapping("/talon/save")
    public String saveTalon(@ModelAttribute TalonDePayeDto talonDePayeDto) {

        TalonDePayeDto newTalonDePayeDto = talonDePayeService.save(talonDePayeDto);
        return "redirect:/talon/" + talonDePayeDto.getId();
    }


    @GetMapping("/talons")
    public String talons(Model theModel) {
        List<TalonDePayeDto> talons = talonDePayeService.findAll();
        theModel.addAttribute("talons", talons);
        return "talons";
    }
}
