package org.example.cdi.bootstrap.junit.qualifier;

import org.example.cdi.bootstrap.junit.qualifier.bmw.BmwService;
import org.example.cdi.bootstrap.junit.qualifier.bmw.ManufacturerBmw;
import org.example.cdi.bootstrap.junit.qualifier.mercedes.ManufacturerMercedes;
import org.example.cdi.bootstrap.junit.qualifier.mercedes.MercedesService;
import org.example.cdi.bootstrap.junit.qualifier.renault.RenaultService;
import org.example.cdi.bootstrap.junit.qualifier.toyota.ToyotaService;
import org.jboss.weld.junit5.auto.AddBeanClasses;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@AddBeanClasses({ToyotaService.class, RenaultService.class})
public class CarServiceTest {

    @Inject
    @ManufacturerBmw
    private BmwService bmwService;

    @Inject
    @ManufacturerBmw
    private CarService bmwCarService;

    @Inject
    @ManufacturerMercedes
    private MercedesService mercedesService;

    @Inject
    @ManufacturerMercedes
    private CarService mercedesCarService;

    @Inject
    @CarManufacturer("toyota")
    private CarService toyotaCarService;

    @Inject
    @CarManufacturer("renault")
    private CarService renaultCarService;

    @Test
    public void test_injection() {
        assertEquals("bmw", bmwService.produceCar().getName());
        assertEquals("mercedes", mercedesService.produceCar().getName());

        assertEquals("bmw", bmwCarService.produceCar().getName());
        assertEquals("mercedes", mercedesCarService.produceCar().getName());

        assertEquals("toyota", toyotaCarService.produceCar().getName());
        assertEquals("renault", renaultCarService.produceCar().getName());
    }

}
