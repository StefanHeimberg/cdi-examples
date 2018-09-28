package org.example.cdi;

import javax.enterprise.context.Dependent;

@Dependent
public class MyBean {
    public String sayHello() {
        return "hello";
    }
}
