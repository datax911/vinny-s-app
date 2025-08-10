package ca.vrg_online.app.controllers.rest;

import ca.vrg_online.app.dto.TalonDePayeDto;
import ca.vrg_online.app.services.TalonDePayeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/talon-de-paye")
public class TalonDePayeController {


    private final TalonDePayeService talonDePayeService;

    public TalonDePayeController(TalonDePayeService talonDePayeService) {
        this.talonDePayeService = talonDePayeService;
    }

    @GetMapping("")
    public List<TalonDePayeDto> getAll() {
        return talonDePayeService.findAll();
    }


}
