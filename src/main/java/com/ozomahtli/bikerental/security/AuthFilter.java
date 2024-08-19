package com.ozomahtli.bikerental.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.RequestMatcher;

import java.io.IOException;

public class AuthFilter extends AbstractAuthenticationProcessingFilter {

    private static final String HEADER_API_KEY = "X-API-KEY";
    private static final String HEADER_API_SECRET = "X-API-SECRET";

    public AuthFilter(String defaultFilterProcessesUrl) {
        super(defaultFilterProcessesUrl);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException, IOException, ServletException {

        String apiKey = request.getHeader(HEADER_API_KEY);
        String apiSecret = request.getHeader(HEADER_API_SECRET);

        if (apiKey == null || apiSecret == null) {
            throw new RuntimeException("API key and secret are required");
        }

        ApiKeyAuthentication authToken = new ApiKeyAuthentication(apiKey, apiSecret);
        return getAuthenticationManager().authenticate(authToken);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult)
            throws IOException, ServletException {
        super.successfulAuthentication(request, response, chain, authResult);
        chain.doFilter(request, response);
    }
}

//    private static final String HEADER_API_KEY = "X-API-KEY";
//    private static final String HEADER_API_SECRET = "X-API-SECRET";
//
//    public AuthFilter(String defaultFilterProcessesUrl) {
//        super(defaultFilterProcessesUrl);
//    }
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
//            throws AuthenticationException, IOException, ServletException {
//
//        String apiKey = request.getHeader(HEADER_API_KEY);
//        String apiSecret = request.getHeader(HEADER_API_SECRET);
//
//        if (apiKey == null || apiSecret == null) {
//            throw new RuntimeException("API key and secret are required");
//        }
//
//        ApiKeyAuthentication authToken = new ApiKeyAuthentication(apiKey, apiSecret);
//        return getAuthenticationManager().authenticate(authToken);
//    }
//
//    @Override
//    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult)
//            throws IOException, ServletException {
//        super.successfulAuthentication(request, response, chain, authResult);
//        chain.doFilter(request, response);
//    }