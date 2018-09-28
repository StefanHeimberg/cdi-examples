package org.example.cdi.bootstrap.junit.qualifier.bmw;

import org.example.cdi.bootstrap.junit.qualifier.CarService;

import javax.enterprise.context.Dependent;

@Dependent
@ManufacturerBmw
public class BmwService implements CarService {

    @Override
    public Bmw produceCar() {
        return new Bmw();
    }

}
