package org.example.cdi.bootstrap.junit.qualifier.mercedes;

import org.example.cdi.bootstrap.junit.qualifier.Car;

public class Mercedes implements Car {

    @Override
    public String getName() {
        return "mercedes";
    }

}
