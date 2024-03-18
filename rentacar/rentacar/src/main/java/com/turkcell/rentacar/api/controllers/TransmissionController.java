package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.TransmissionService;
import com.turkcell.rentacar.entities.concretes.Transmission;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/transmissions")
public class TransmissionController {
    private TransmissionService transmissionService;   // IoC

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Transmission add(@RequestBody Transmission transmission) {
        return transmissionService.add(transmission);
    }

    @PutMapping("/{id}")
    public Transmission update(@PathVariable("id") int id, @RequestBody Transmission transmission) {
        //transmission.setId(id);
        return transmissionService.update(transmission);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") int id) {
        transmissionService.delete(id);
    }

    @GetMapping("/{id}")
    public Transmission getById(@PathVariable("id") int id) {
        return transmissionService.getById(id);
    }

    @GetMapping
    public List<Transmission> getAll() {
        return transmissionService.getAll();
    }
}
