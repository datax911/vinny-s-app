package ca.vrg_online.app.controllers.rest;

import ca.vrg_online.app.dtos.TalonDePayeDto;
import ca.vrg_online.app.services.TalonDePayeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("")
    public ResponseEntity<TalonDePayeDto> create(@RequestBody TalonDePayeDto talonDePayeDto) {

        TalonDePayeDto newTalonDePayeDto = talonDePayeService.save(talonDePayeDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTalonDePayeDto);
    }


}
