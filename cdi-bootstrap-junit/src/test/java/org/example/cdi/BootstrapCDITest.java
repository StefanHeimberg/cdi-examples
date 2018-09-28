package org.example.cdi;

import org.junit.jupiter.api.Test;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BootstrapCDITest {

    @Test
    public void test() {
        try(SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            final MyBean myBean = container.select(MyBean.class).get();
            assertEquals("hello", myBean.sayHello());
        }
    }

}
