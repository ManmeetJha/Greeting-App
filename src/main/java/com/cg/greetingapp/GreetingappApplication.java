package com.cg.greetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingappApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingappApplication.class, args);
    }

}
//curl -X PUT -H "Content-Type: application/json" -d '{"firstName":"Manmeet","lastName":"Jha"}' "http://localhost:8080/hello/put/{Manmeet}"
//curl -X PUT "http://localhost:8080/hello/put/Manmeet?lastName=Jha"