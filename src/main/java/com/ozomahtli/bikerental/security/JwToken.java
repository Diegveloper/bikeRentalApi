package com.ozomahtli.bikerental.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;

import javax.security.auth.Subject;

public class JwToken extends AbstractAuthenticationToken {
    public JwToken(){
        super(AuthorityUtils.createAuthorityList("Role_user"));
    }
    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return "Jwt";
    }

    @Override
    public boolean implies(Subject subject) {
        return super.implies(subject);
    }

    @Override
    public boolean isAuthenticated() {
        return true;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        throw new RuntimeException("Can't re authenticate");
    }
}
