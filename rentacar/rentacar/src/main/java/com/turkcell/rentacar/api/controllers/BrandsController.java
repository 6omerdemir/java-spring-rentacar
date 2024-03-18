package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.BrandService;
import com.turkcell.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/brands")
public class BrandsController {
    private BrandService brandService;   //IoC
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Brand add(@RequestBody Brand brand) {
        return brandService.add(brand);
    }

    @PutMapping("/{id}")
    public Brand update(@PathVariable("id") int id, @RequestBody Brand brand) {
        //brand.setId(id);
        return brandService.update(brand);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") int id) {
        brandService.delete(id);
    }

    @GetMapping("/{id}")
    public Brand getById(@PathVariable("id") int id) {
        return brandService.getById(id);
    }

    @GetMapping
    public List<Brand> getAll() {
        return brandService.getAll();
    }
}
