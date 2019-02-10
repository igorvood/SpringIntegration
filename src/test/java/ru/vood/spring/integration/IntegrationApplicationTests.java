package ru.vood.spring.integration;

import javafx.util.Pair;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegrationApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        List<Pair<String, Object>> c = Stream.of(applicationContext.getBeanDefinitionNames())
                .sorted(String::compareTo)
                .map(s -> new Pair<>(s, applicationContext.getBean(s)))
                .collect(Collectors.toList());

        List<String> names = c.stream()
                .map(Pair::getKey)
                .collect(Collectors.toList());

        List<? extends Class<?>> clazz = c.stream()
                .map(q -> q.getValue().getClass())
                .peek(w -> System.out.println(w.getName()))
                .collect(Collectors.toList());

        System.out.println(clazz);
        System.out.println(names);


        Pair<String, Object> me = c.stream()
                .filter(classObjectPair -> classObjectPair.getKey().contains("queueChannel"))
                .findFirst().orElse(null);
        System.out.println(me);


        System.out.println(c);
    }

}

