package com.ikang.saas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyang
 */
@RestController
@RequestMapping(value = "/web")
public class CheckHealthController {

    @GetMapping(value = "/check")
    public String health() {
        return "Hello , I am still alive !";
    }
}
