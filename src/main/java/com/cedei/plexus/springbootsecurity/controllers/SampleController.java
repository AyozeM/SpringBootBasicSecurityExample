package com.cedei.plexus.springbootsecurity.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class SampleController {

    @PreAuthorize("hasAnyRole('admin','user')")
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world!";
    }

    @PreAuthorize("hasRole('admin')")
    @GetMapping("/admin/hello")
    public String sayAdminHello() {
        return "Hello world!, Mr. Admin";
    }
}