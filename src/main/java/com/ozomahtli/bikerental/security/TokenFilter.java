package com.ozomahtli.bikerental.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import java.io.IOException;

public class TokenFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
    throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURI = httpRequest.getRequestURI();

        if (requestURI.equals("/authenticate")) {
            filterChain.doFilter(request, response);
            return;
        }
        try{
            Authentication a = AuthenticationService.validateJwt((HttpServletRequest) request);
            SecurityContextHolder.getContext().setAuthentication(a);
            filterChain.doFilter(request, response);
        }
        catch (Exception exp){

        }
    }
}
