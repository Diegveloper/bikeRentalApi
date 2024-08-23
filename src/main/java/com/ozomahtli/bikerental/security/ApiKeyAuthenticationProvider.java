package com.ozomahtli.bikerental.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class ApiKeyAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        System.out.println("in the provider");
        return new ApiKeyToken();
    }

    @Override
    public boolean supports(Class<?> authentication) {
        System.out.println("supporting");
        return ApiKeyToken.class.isAssignableFrom(authentication);
    }
}
