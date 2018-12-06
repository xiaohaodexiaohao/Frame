package com.dist.service;

import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.annotation.ImportResource;

        import java.io.IOException;

/**
 * @author wsw
 */
@SpringBootApplication
@ImportResource({"classpath:spring-provider-dubbo.xml"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}