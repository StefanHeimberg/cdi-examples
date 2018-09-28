package org.example.cdi.bootstrap.junit.qualifier.renault;

import org.example.cdi.bootstrap.junit.qualifier.CarService;
import org.example.cdi.bootstrap.junit.qualifier.CarManufacturer;

import javax.enterprise.context.Dependent;

@Dependent
@CarManufacturer("renault")
public class RenaultService implements CarService {

    @Override
    public Renault produceCar() {
        return new Renault();
    }

}
