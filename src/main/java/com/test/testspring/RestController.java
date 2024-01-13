package com.test.testspring;

import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    public String index() {
        return "2 TEst commit Greetings from Spring Boot test project";
}
}
