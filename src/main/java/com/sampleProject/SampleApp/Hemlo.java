package com.sampleProject.SampleApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hemlo {

    @RequestMapping("")
    public String greetings(){
        return "Namaste , How are you";
    }
}
