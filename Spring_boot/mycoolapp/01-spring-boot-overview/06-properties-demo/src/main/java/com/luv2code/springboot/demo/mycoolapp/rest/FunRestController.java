package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoint "teamInfo"
    @GetMapping("/teaminfo")
    public String teamInfo() {
        return "Coach Name" + coachName + ", Team name: " + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!...";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        int a = 10;
        int b = 20;
        int c = a + b;
        return "Vinodh I LOVE YOU " + c + " Times";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day....!";
    }

}
