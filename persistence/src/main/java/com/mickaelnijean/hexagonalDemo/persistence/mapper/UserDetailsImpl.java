package com.mickaelnijean.hexagonalDemo.persistence.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsImpl implements UserDetails {
    
    private String mail;
    private String password;
    private String firstName;
    private String lastName;
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return null;
    }
    
    @Override
    public String getPassword(){
        return this.password;
    }
    
    @Override
    public String getUsername(){
        return this.mail;
    }
    
    @Override
    public boolean isAccountNonExpired(){
        return true;
    }
    
    @Override
    public boolean isAccountNonLocked(){
        return true;
    }
    
    @Override
    public boolean isCredentialsNonExpired(){
        return true;
    }
    
    @Override
    public boolean isEnabled(){
        return true;
    }
}
