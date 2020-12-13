package com.ted.data.express.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MessageController {
    @GetMapping("hello")
    public Mono<String> helloWorld(){
        return Mono.just("Hello World");
    }
}
