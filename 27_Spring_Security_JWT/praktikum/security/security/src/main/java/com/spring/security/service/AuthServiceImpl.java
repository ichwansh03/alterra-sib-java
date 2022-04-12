package com.spring.security.service;

import com.spring.security.model.Users;
import com.spring.security.payload.TokenResponse;
import com.spring.security.payload.UsernamePassword;
import com.spring.security.repository.UserRepository;
import com.spring.security.security.JwtProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final JwtProvider jwtProvider;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Users register(UsernamePassword req) {
        Users users = new Users();
        users.setUsername(req.getUsername());
        users.setPassword(passwordEncoder.encode(req.getPassword()));

        return userRepository.save(users);
    }

    @Override
    public TokenResponse generatedToken(UsernamePassword req) {
        try{
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            req.getUsername(),
                            req.getPassword()
                    )
            );
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtProvider.generateToken(authentication);
            TokenResponse tokenResponse = new TokenResponse();
            tokenResponse.setToken(jwt);
            return tokenResponse;
        } catch (BadCredentialsException e){
            log.error("Bad Credential", e);
            throw new RuntimeException(e.getMessage(), e);
        } catch (Exception e){
            log.error(e.getMessage(),e);
            throw new RuntimeException(e.getMessage(),e);
        }

    }
}
