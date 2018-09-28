package org.example.cdi.bootstrap.junit.test;

import javax.enterprise.context.Dependent;

@Dependent
public class MyBean {

    public String sayHello() {
        return "hello";
    }

}
