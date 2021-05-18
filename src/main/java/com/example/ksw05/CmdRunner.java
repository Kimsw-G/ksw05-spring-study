package com.example.ksw05;

import org.springframework.boot.CommandLineRunner;

public class CmdRunner implements CommandLineRunner {

    // run 메소드가 같이 실행
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CmdRun이 실행됐따");
    }
}
