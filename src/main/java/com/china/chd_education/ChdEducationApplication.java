package com.china.chd_education;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan(basePackages = {"com.china.chd_education.mapper"})
@PropertySource("classpath:application.properties")
public class ChdEducationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChdEducationApplication.class, args);
    }

}
