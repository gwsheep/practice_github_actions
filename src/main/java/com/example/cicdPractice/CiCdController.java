package com.example.cicdPractice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiCdController {

    @GetMapping("/")
    public String home() {
        return "Good World";
    }


}
