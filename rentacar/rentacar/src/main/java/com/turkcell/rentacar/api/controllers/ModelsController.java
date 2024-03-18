package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.ModelService;
import com.turkcell.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/models")
public class ModelsController {
    private ModelService modelService;   // IoC

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Model add(@RequestBody Model model) {
        return modelService.add(model);
    }

    @PutMapping("/{id}")
    public Model update(@PathVariable("id") int id, @RequestBody Model model) {
        //model.setId(id);
        return modelService.update(model);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") int id) {
        modelService.delete(id);
    }

    @GetMapping("/{id}")
    public Model getById(@PathVariable("id") int id) {
        return modelService.getById(id);
    }

    @GetMapping
    public List<Model> getAll() {
        return modelService.getAll();
    }
}
