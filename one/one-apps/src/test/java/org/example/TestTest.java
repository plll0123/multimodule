package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class TestTest {

    @Test
    void test() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(StaticConfig.class);
        ac.getBean(HelloBean.class);
    }

    @Test
    void selectorConfig() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SelectorConfig.class);
        HelloBean bean = ac.getBean(HelloBean.class);
        Assertions.assertNotNull(bean);
        HelloConfig bean1 = ac.getBean(HelloConfig.class);
        Assertions.assertNotNull(bean1);
    }

    @Configuration
    @Import(HelloConfig.class)
    public static class StaticConfig {

    }

    @Configuration
    @Import(HelloImportSelector.class)
    static class SelectorConfig {

    }
}
