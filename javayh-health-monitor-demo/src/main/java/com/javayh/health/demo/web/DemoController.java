package com.javayh.health.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2021-04-14
 */
@RestController
@RequestMapping(value = "demo")
public class DemoController {

    @GetMapping(value = "/test")
    public String get(){
        return "Hello Health Monitor";
    }

}
