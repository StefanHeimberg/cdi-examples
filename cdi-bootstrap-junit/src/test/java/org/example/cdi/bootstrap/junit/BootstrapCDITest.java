package org.example.cdi.bootstrap.junit;

import org.example.cdi.bootstrap.junit.test.MyBean;
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
