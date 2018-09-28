package org.example.cdi.bootstrap.junit.qualifier.renault;

import org.example.cdi.bootstrap.junit.qualifier.Car;

public class Renault implements Car {

    @Override
    public String getName() {
        return "renault";
    }

}
