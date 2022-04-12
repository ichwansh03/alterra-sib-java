package com.spring.security.service;

import com.spring.security.model.Users;
import com.spring.security.payload.TokenResponse;
import com.spring.security.payload.UsernamePassword;

public interface AuthService {
    Users register(UsernamePassword req);
    TokenResponse generatedToken(UsernamePassword req);
}
