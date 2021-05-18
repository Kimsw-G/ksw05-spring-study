package com.example.ksw05;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class AppRunner implements ApplicationRunner {
    // Application이 실행될때에, 같이 실행됨.
    // run 메소드가 같이 실행

    @Override
    public void run(ApplicationArguments args)throws Exception{
        System.out.println("AppRun이 실행됐따");
    }
}
