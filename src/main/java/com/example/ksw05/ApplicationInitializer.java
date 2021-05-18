package com.example.ksw05;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ApplicationInitializer extends SpringBootServletInitializer {
    // SpringBoot로 웹App을 만들고,
    // 이를 WAR로 배포시에는 SpringBootServletInitializer를 상속해야함
    // web.xml 없이 ServletContext 제어 가능
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Ksw05Application.class);
    }
}
