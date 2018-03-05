package com.example.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/hello", "hi"}, method = RequestMethod.GET)
    public String say() {
        return "Hello Spring Boot!" + girlProperties.getCupSize() + girlProperties.getAge();
    }
}
