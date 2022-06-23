package co.develhope.First.API3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping("")
    public String getConStr(@RequestParam String s1, @RequestParam(required = false) String s2){
        return s2 != null ? s1 + s2 : s1;
    }

}
