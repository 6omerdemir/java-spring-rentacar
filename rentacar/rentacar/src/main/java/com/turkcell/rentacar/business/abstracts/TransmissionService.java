package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Model;
import com.turkcell.rentacar.entities.concretes.Transmission;

import java.util.List;

public interface TransmissionService {
    Transmission add(Transmission transmission);
    Transmission update(Transmission transmission);
    void delete(int id);
    Transmission getById(int id);
    List<Transmission> getAll();
}
