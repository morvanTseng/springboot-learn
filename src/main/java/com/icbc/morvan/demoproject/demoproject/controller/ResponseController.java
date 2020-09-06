package com.icbc.morvan.demoproject.demoproject.controller;

import com.icbc.morvan.demoproject.demoproject.domain.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author morvan
 * @time 2020-9-5
 * @description: this controller is for testing how to return jason data from back to front
 */
@RestController
@RequestMapping("/jason")
public class ResponseController {

    /**
     *this method receive an person object from front-end and return it back, just to see  wether we can get an polo
     * by "@RequestBody" annotation ,and return it back.
     * @param person an Person object
     * @return an person object
     */
    @PostMapping("/person")
    public Person getPerson(@RequestBody Person person){
        return new Person("tom", "123456", 23);
    }

}
