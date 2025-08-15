package ca.vrg_online.app.controllers;


import ca.vrg_online.app.dtos.ExempleDto;
import ca.vrg_online.app.services.ExempleService;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/exemples")
public class ExempleController {


    private final ExempleService exempleService;

    public ExempleController(ExempleService exempleService) {
        this.exempleService = exempleService;
    }


    @GetMapping("")
    public String listAll(Model model) {

        model.addAttribute("exemples", exempleService.findAll());
        return "exemples/list";
    }



    @GetMapping("/{id}")
    public String details(@PathVariable Long id, Model model) {
        model.addAttribute("exemple", exempleService.findById(id));
        return "exemples/details";
    }



    @GetMapping("/{id}/update")
    public String update(@PathVariable Long id, Model model) {
        model.addAttribute("exemple", exempleService.findById(id));
        return "exemples/form";
    }



    @GetMapping("/create")
    public String create(Model theModel) {
        theModel.addAttribute("exemple", new ExempleDto());
        return "/exemples/form";
    }



    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("exemple") ExempleDto exempleDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "/exemples/form";
        }
        ExempleDto newExempleDto = exempleService.save(exempleDto);
        return  "redirect:/exemples/" + newExempleDto.getId();
    }



    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        exempleService.deleteById(id);
        return "redirect:/exemples";
    }


}
