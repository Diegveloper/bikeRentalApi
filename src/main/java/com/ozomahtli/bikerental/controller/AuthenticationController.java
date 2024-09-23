package com.ozomahtli.bikerental.controller;


import com.ozomahtli.bikerental.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @Autowired
    AuthService authService;

    @GetMapping("/authenticate")
    public String getToken(){
        return authService.getToken();
    }
    @PostMapping("/authenticate")
    public String getNewToken(@RequestBody Credentials c){
        System.out.println("here");

        //Throw Exception if no values are passed
        if(!this.authService.isAuthenticated(c.username(),c.password())){
            //Throw Exception if not
            return "";
        }
        String token = authService.getToken();
        return token;
    }
}

record Credentials (String username, String password){}
