package com.ozomahtli.bikerental.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Objects;

public class ApiKeyFilter extends OncePerRequestFilter {



    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain)
            throws ServletException, IOException {

        try{
            Authentication a = AuthenticationService.getAuthentication((HttpServletRequest)request);
            SecurityContextHolder.getContext().setAuthentication(a);
        }
        catch(Exception e){
            HttpServletResponse r = (HttpServletResponse) response;
            r.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            r.setContentType(MediaType.APPLICATION_JSON_VALUE);
            PrintWriter writer = r.getWriter();
            writer.print(e.getMessage());
            writer.flush();
            writer.close();
        }
//        System.out.println("El: -> " + request.getHeader("X-API-Key") );
//
//        if(!Objects.equals(request.getHeader("X-API-Key"), "hola")) {
//            System.out.println("Invalid API Key");
//            response.setStatus(HttpStatus.FORBIDDEN.value());
//            return;
//        }
//
//        var auth = new ApiKeyToken();
//        var newContext = SecurityContextHolder.createEmptyContext();
//        newContext.setAuthentication(auth);
//        SecurityContextHolder.setContext(newContext);
        filterChain.doFilter(request, response);
    }
}
