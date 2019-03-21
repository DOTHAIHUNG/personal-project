package com.league.bloglol.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class TestRestAPIs {
    @GetMapping("api/test/user")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String userAccess(){
        return ">>> User contents!";
    }

    @GetMapping("api/test/pm")
    @PreAuthorize("hasRole('PMw') or hasRole('ADMIN')")
    public String projectManagementAccess(){
        return ">>> Project management board";
    }

    @GetMapping("api/test/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess(){
        return ">>> Admin contents!";
    }
}
