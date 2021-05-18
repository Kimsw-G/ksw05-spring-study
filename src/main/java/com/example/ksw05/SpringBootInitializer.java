package com.example.ksw05;

import org.apache.commons.logging.Log;
import org.springframework.web.WebApplicationInitializer;

public abstract class SpringBootInitializer implements WebApplicationInitializer {
    protected Log logger;
    private boolean registerErrorPageFilter = true;

    // COntext를 생성, ServletContext에 추가
    // WebAppContext트로는 AnnotationConfigEmbeddedApplicationContex를 사용

    // 이 클래스를 상속한다
    // => Tomcat과 같은 Servlet환경에서 SpringBoot앱이 동작하도록 WebAppContext를 구성
    // WAR 배포를 위한 목적
    public SpringBootInitializer(){

    }
}
