package com.jeremy.demo.shiro;

import org.apache.shiro.authc.AuthenticationToken;

public class UserAuthenticationToken implements AuthenticationToken {
    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public Object getCredentials() {
        return null;
    }
}
