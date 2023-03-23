package com.somosf5community.security;

import com.somosf5community.models.Role;
import org.springframework.security.core.GrantedAuthority;


public class SecurityAuthority implements GrantedAuthority{
    
    private final Role authority;

    public SecurityAuthority(Role authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority.getRoleName();
    }
}
