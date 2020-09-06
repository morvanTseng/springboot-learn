package com.icbc.morvan.demoproject.demoproject.controller;

import com.icbc.morvan.demoproject.demoproject.domain.Library;
import com.icbc.morvan.demoproject.demoproject.domain.Library1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this controller is for reading configs from .properties file
 * Author: morvan
 * time: 2020-9-5
 */
@RestController
@RequestMapping("config")
public class ConfigController {
    @Value("${library.location}")
    private String location;

    @Autowired
    private Library library;

    /**
     *this method returns  a String configurated by application.properties file
     * and as we can see the application.properties file is read automatically
     * @return String
     */
    @GetMapping("location")
    public String getLocation(){
        return this.location;
    }

    /**
     * read properties from application.properties file. during this test
     * i also set a yml under dir resources together with app.properties file.
     * but this doesnt seem work. it seems it only reads from .properties file.
     * later, i should learn about how to set filepath.
     * @return
     */
    @GetMapping("library")
    public Library getLibrary(){
        return library;
    }

    @Autowired
    private Library1 library1;

    @GetMapping("library1")
    public Library1 getLibrary1(){
        return library1;
    }
}
