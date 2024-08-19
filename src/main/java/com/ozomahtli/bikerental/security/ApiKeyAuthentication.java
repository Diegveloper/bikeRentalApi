package com.ozomahtli.bikerental.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class ApiKeyAuthentication extends AbstractAuthenticationToken {
    private final String apiKey;
    private final String secret;

    public ApiKeyAuthentication(String apiKey, String secret) {
        super(null);
        this.apiKey = apiKey;
        this.secret = secret;
        setAuthenticated(false);
    }

    public ApiKeyAuthentication(String apiKey, String apiSecret, Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
        this.apiKey = apiKey;
        this.secret = apiSecret;
        setAuthenticated(true);  // This token is now authenticated
    }

    @Override
    public Object getCredentials() {
        return this.secret;
    }

    @Override
    public Object getPrincipal() {
        return this.apiKey;
    }
}