package org.example.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BootstrapCDITest {

    @Test
    public void test() {
        try (WeldContainer container = new Weld().enableDevMode().initialize()) {
            final MyBean myBean = container.select(MyBean.class).get();
            assertEquals("hello", myBean.sayHello());
        }
    }

}
