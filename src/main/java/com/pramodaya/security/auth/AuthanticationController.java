package com.pramodaya.security.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthanticationController {

    private final AuthanticationService authanticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(authanticationService.register(request));
    }

    @PostMapping("/authanticate")
    public ResponseEntity<AuthenticationResponse> authanticate(
            @RequestBody AuthanticationRequest request
    ){
        return ResponseEntity.ok(authanticationService.authenticate(request));
    }


}
