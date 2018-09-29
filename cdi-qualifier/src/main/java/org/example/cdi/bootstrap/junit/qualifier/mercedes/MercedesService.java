package org.example.cdi.bootstrap.junit.qualifier.mercedes;

import org.example.cdi.bootstrap.junit.qualifier.CarService;

import javax.enterprise.context.Dependent;

@Dependent
@ManufacturerMercedes
public class MercedesService implements CarService<Mercedes> {

    @Override
    public Mercedes produceCar() {
        return new Mercedes();
    }

}
