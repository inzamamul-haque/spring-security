package com.inzamamul.security.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/helloAdmin")
    public String getName() {
        return "Hello Admin";
    }

    @GetMapping("/")
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/public")
    public String hello() {
        return "public";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/getName")
    public String getAdminName() {
        return "Hello Rifat Admin";
    }

    @GetMapping("/helloUser")
    public String getUserName() {
        return "Hello User";
    }


}
