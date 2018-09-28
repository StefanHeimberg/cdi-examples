package org.example.cdi.bootstrap.junit.qualifier.toyota;

import org.example.cdi.bootstrap.junit.qualifier.Car;

public class Toyota implements Car {

    @Override
    public String getName() {
        return "toyota";
    }

}
