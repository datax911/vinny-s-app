package ca.vrg_online.app.controllers;


import ca.vrg_online.app.dto.ExempleDto;
import ca.vrg_online.app.entities.Exemple;
import ca.vrg_online.app.services.ExempleService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExempleController {


    private final ExempleService exempleService;

    public ExempleController(ExempleService exempleService) {
        this.exempleService = exempleService;
    }

    @GetMapping("/exemples")
    public String exemples(Model theModel) {

        theModel.addAttribute("exemples", exempleService.findAll());
        return "exemples/list";
    }

    @GetMapping("/exemples/{id}")
    public String exemple(@PathVariable Long id, Model model) {

        model.addAttribute("id", id);

        return "exemples/details";
    }

    @GetMapping("/exemples/create")
    public String create(Model theModel) {
        theModel.addAttribute("exemple", new ExempleDto());
        return "exemples/details";
    }

    @PostMapping("/exemples/create")
    public String create(@Validated(ExempleDto.Create.class) ExempleDto exempleDto) {
        ExempleDto newExempleDto = exempleService.save(exempleDto);

        return  "redirect:/exemples/" + newExempleDto.getId();
    }


}
