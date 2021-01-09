package com.irvingdidier.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HolaMundoController {

    @GetMapping("/hello")
    public String greeting() {
        return "Hello world from spring boot";
    }
}
