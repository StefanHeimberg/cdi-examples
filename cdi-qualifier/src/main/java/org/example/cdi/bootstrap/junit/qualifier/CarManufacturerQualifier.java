package org.example.cdi.bootstrap.junit.qualifier;

import javax.enterprise.util.AnnotationLiteral;

public class CarManufacturerQualifier extends AnnotationLiteral<CarManufacturer> implements CarManufacturer {

    private final String value;

    public CarManufacturerQualifier(final String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
