package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LevelController {

    @Value("${levelNumber}")
    private int levelNumber;

    @GetMapping("/level")
    public String getLevel() {
        return levelNumber < 1 ? "basic" : "advanced";
    }
}
