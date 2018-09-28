package org.example.cdi.bootstrap.junit.qualifier;

import org.example.cdi.bootstrap.junit.qualifier.bmw.BmwService;
import org.example.cdi.bootstrap.junit.qualifier.bmw.ManufacturerBmw;
import org.example.cdi.bootstrap.junit.qualifier.mercedes.ManufacturerMercedes;
import org.example.cdi.bootstrap.junit.qualifier.mercedes.MercedesService;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    public void test_direct_inject() {
        assertEquals("bmw", bmwService.produceCar().getName());
        assertEquals("mercedes", mercedesService.produceCar().getName());
    }

    @Test
    public void test_qualified_inject() {
        assertEquals("bmw", bmwCarService.produceCar().getName());
        assertEquals("mercedes", mercedesCarService.produceCar().getName());
    }

}
