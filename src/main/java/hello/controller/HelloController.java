package hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello There";
    }

    @GetMapping("/{username}")
    public String sayHello(@PathVariable("username") String username){
        return "Hello "+ username;
    }

}
