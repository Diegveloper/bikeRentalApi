package com.ozomahtli.bikerental.services;


import com.ozomahtli.bikerental.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private JwtUtils jwt;

    public String getToken(){
        return jwt.generateToken("diegolin");
    }

    public Boolean isAuthenticated(String username, String pwd){
        return username.equals("diegolin") && pwd.equals("1234");
    }
}



