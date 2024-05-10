package hello.dockertest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("")
    public String printHello() {
        return "CICD 성공!!";
    }

    @GetMapping("/hello")
    public String printHi(){
        return "Hello Spring!!!";
    }
}
