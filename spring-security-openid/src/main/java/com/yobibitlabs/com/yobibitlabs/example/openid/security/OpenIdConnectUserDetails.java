package com.yobibitlabs.com.yobibitlabs.example.openid.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.common.OAuth2AccessToken;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public class OpenIdConnectUserDetails implements UserDetails {

    private static final long serialVersionUID = 1L;
    private String userId;
    private String username;
    private OAuth2AccessToken token;

    public OpenIdConnectUserDetails(Map<String,String> userInfo, OAuth2AccessToken token) {
        this.userId = userInfo.get("sub");
        this.username = userInfo.get("email");
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public OAuth2AccessToken getToken() {
        return token;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
