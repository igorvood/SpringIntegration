package ru.vood.spring.integration.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlowDefinition;
import org.springframework.integration.transformer.GenericTransformer;
import ru.vood.spring.integration.transformer.TransformerOne;

@Configuration
public class Dsl {

    @Autowired
    TransformerOne transformerOne;

    @Bean
    public IntegrationFlow upcase() {
        return new IntegrationFlow() {
            @Override
            public void configure(IntegrationFlowDefinition<?> f) {
                f.transform(new GenericTransformer<String, String>() {
                    @Override
                    public String transform(String source) {
                        return null;
                    }
                })
                        .split()                                         // 1
                        .<String, String>transform(String::toUpperCase)  // 2
                        .aggregate();
            }
        };                                    // 3
    }
}
