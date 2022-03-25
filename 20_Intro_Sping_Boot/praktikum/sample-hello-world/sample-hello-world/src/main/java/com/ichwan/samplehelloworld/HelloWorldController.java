package com.ichwan.samplehelloworld;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class HelloWorldController {

    @GetMapping()
    public String getUsers() {
        return "Hello world from spring GET";
    }

    @PostMapping()
    public String createUsers(){
        return "Hello world from spring POST";
    }

    @DeleteMapping()
    public String deleteUsers(){
        return "Hello world from spring DELETE";
    }

}
