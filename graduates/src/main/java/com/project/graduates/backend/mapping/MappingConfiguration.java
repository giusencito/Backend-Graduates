package com.project.graduates.backend.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("GraduateMappingConfiguration")
public class MappingConfiguration {

    @Bean
    public GraduateMapper graduateMapper() {
        return new GraduateMapper();
    }


}
