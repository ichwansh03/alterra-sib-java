package com.spring.security.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "users")
public class Users implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role;

    @Column(columnDefinition = "boolean default true")
    private boolean acitve = true;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return acitve;
    }

    @Override
    public boolean isAccountNonLocked() {
        return acitve;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return acitve;
    }

    @Override
    public boolean isEnabled() {
        return acitve;
    }
}
