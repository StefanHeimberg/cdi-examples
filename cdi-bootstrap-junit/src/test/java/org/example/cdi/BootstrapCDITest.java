package org.example.cdi;

import org.example.cdi.bootstrap.junit.MyBean;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BootstrapCDITest {

    @Inject
    private MyBean myBean;

    @Test
    public void test() {
        assertEquals("hello", myBean.sayHello());
    }

}
