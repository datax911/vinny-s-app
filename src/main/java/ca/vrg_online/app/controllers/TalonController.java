package ca.vrg_online.app.controllers;

import ca.vrg_online.app.dtos.TalonDePayeDto;
import ca.vrg_online.app.services.TalonDePayeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TalonController {

    private final TalonDePayeService talonDePayeService;

    public TalonController(TalonDePayeService talonDePayeService) {
        this.talonDePayeService = talonDePayeService;
    }

    @GetMapping("/talons")
    public String talons(Model theModel) {
        List<TalonDePayeDto> talons = talonDePayeService.findAll();
        theModel.addAttribute("talons", talons);
        return "talons/list";
    }

    @GetMapping("/talons/{id}")
    public String talon(@PathVariable Long id, Model theModel) {
        TalonDePayeDto talonDePayeDto = talonDePayeService.findById(id);
        theModel.addAttribute("talon", talonDePayeDto);
        return "talons/details";
    }

    @PostMapping("/talons/{id}")
    public String saveTalon(@PathVariable Long id, @ModelAttribute TalonDePayeDto talonDePayeDto) {

        TalonDePayeDto newTalonDePayeDto = talonDePayeService.save(talonDePayeDto);
        return "redirect:/talons/" + talonDePayeDto.getId();
    }


}
