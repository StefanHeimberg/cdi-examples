package org.example.cdi.bootstrap.junit.qualifier.bmw;

import org.example.cdi.bootstrap.junit.qualifier.Car;

public class Bmw implements Car {

    @Override
    public String getName() {
        return "bmw";
    }

}
