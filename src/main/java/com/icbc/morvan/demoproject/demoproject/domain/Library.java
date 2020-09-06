package com.icbc.morvan.demoproject.demoproject.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * this is for testing read fields from appliation.properties file
 * @Author morvan
 * @Time 2020-9-6
 */

@Component
@ConfigurationProperties(prefix = "library")
public class Library {
    private String location1;
    private String location2;

    public Library() {
    }

    public String getLocation1() {
        return location1;
    }

    public void setLocation1(String location1) {
        this.location1 = location1;
    }

    public String getLocation2() {
        return location2;
    }

    public void setLocation2(String location2) {
        this.location2 = location2;
    }
}
