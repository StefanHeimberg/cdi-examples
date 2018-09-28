package org.example.cdi.bootstrap.junit.qualifier.toyota;

import org.example.cdi.bootstrap.junit.qualifier.CarService;
import org.example.cdi.bootstrap.junit.qualifier.CarManufacturer;

import javax.enterprise.context.Dependent;

@Dependent
@CarManufacturer("toyota")
public class ToyotaService implements CarService {

    @Override
    public Toyota produceCar() {
        return new Toyota();
    }

}
