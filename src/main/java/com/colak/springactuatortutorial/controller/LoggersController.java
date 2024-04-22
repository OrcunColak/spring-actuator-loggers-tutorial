package com.colak.springactuatortutorial.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoggersController {

    // http://localhost:8080/home

    // To see the effective logging level go to
    // http://localhost:8080/actuator/loggers/com.colak.springactuatortutorial.controller.LoggersController
    @GetMapping("/home")
    public String home() {
        log.trace("This is a TRACE level message for demo purpose");
        log.debug("This is a DEBUG level message for demo purpose");
        log.info("This is an INFO level message for demo purpose");
        log.warn("This is a WARN level message for demo purpose");
        log.error("This is an ERROR level message for demo purpose");
        return "Hello, World";
    }
}
