package com.ozomahtli.bikerental.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private static final String AUTH_TOKEN_HEADER_NAME = "X-API-KEY";
    private static final String AUTH_TOKEN = "Diego";

    public static Authentication getAuthentication(HttpServletRequest request) {
        String apiKey = request.getHeader(AUTH_TOKEN_HEADER_NAME);
        if (apiKey == null || !apiKey.equals(AUTH_TOKEN)) {
            throw new BadCredentialsException("Invalid API Key");
        }

        return new ApiKeyToken();
    }

    public static Authentication validateJwt(HttpServletRequest request){
        String token = request.getHeader("Authorization");
        System.out.println("Mira el token: " + token );
        if(token == null){
            throw new BadCredentialsException("Missing token");
        }
        return new JwToken();
    }
}