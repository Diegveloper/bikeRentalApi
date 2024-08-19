package com.ozomahtli.bikerental.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;

public class AuthProvider implements AuthenticationProvider {
    private static final String VALID_API_KEY = "diego";
    private static final String VALID_API_SECRET = "1234";
    @Override
    public Authentication authenticate(Authentication authentication) {
        String apiKey = (String) authentication.getPrincipal();
        String apiSecret = (String) authentication.getCredentials();

        if (VALID_API_KEY.equals(apiKey) && VALID_API_SECRET.equals(apiSecret)) {
            return new ApiKeyAuthentication(apiKey, apiSecret, Collections.singletonList(new SimpleGrantedAuthority("ROLE_API_USER")));
        } else {
            throw new RuntimeException("Invalid API key or secret");
        }
    }
    @Override
    public boolean supports(Class<?> authenticationClass) {
        return ApiKeyAuthentication.class.isAssignableFrom(authenticationClass);
    }
}
