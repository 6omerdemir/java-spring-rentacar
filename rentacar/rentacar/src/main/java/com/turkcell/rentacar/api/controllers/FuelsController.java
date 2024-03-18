package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.FuelService;
import com.turkcell.rentacar.entities.concretes.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fuels")
public class FuelsController {
    private FuelService fuelService;   // IoC

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Fuel add(@RequestBody Fuel fuel) {
        return fuelService.add(fuel);
    }

    @PutMapping("/{id}")
    public Fuel update(@PathVariable("id") int id, @RequestBody Fuel fuel) {
        //fuel.setId(id);
        return fuelService.update(fuel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") int id) {
        fuelService.delete(id);
    }

    @GetMapping("/{id}")
    public Fuel getById(@PathVariable("id") int id) {
        return fuelService.getById(id);
    }

    @GetMapping
    public List<Fuel> getAll() {
        return fuelService.getAll();
    }
}
