package org.example.cdi.bootstrap.junit.qualifier;

public interface CarService<T extends Car> {

    T produceCar();

}
