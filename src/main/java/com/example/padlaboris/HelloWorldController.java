package com.example.padlaboris;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping (value = "/",method = RequestMethod.GET)
    public ResponseEntity hello(){

        return ResponseEntity.ok().body("Hello New Brave World");
    }
}
