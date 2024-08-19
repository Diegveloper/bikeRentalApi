package com.ozomahtli.bikerental.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;

public class AuthenticationService {

    private static final String AUTH_SECRET_HEADER_NAME = "X-API-SECRET";
    private static final String AUTH_SECRET = "secret";
    private static final String AUTH_TOKEN_HEADER_NAME = "X-API-KEY";
    private static final String AUTH_TOKEN = "diego";

    //Let's pretend this is calling an authentication server somewhere and the values are not hardcoded LOL

    public static Authentication getAuthentication(HttpServletRequest request) {
        String apiKey = request.getHeader(AUTH_TOKEN_HEADER_NAME);
        String apiSecret = request.getHeader(AUTH_SECRET_HEADER_NAME);
        if (apiKey == null || !apiKey.equals(AUTH_TOKEN)) {
            throw new BadCredentialsException("Invalid API Key");
        }
        if( apiSecret ==  null || !apiSecret.equals(AUTH_SECRET)){
            throw new BadCredentialsException("Invalid API Secret");
        }

        return new ApiKeyAuthentication(apiKey, apiSecret, AuthorityUtils.NO_AUTHORITIES);
    }
}