package com.polarbookshop.catalogservice;

import com.polarbookshop.catalogservice.config.DataConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final DataConfig dataConfig;

    public HomeController(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }

    @GetMapping("/")
    public String getGreeting() {
        return dataConfig.getGreeting();
    }
}