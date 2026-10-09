package com.genai.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genai.dto.auth.AuthResponse;
import com.genai.dto.auth.LoginRequest;
import com.genai.dto.auth.SignupRequest;
import com.genai.dto.auth.UserProfileResponse;
import com.genai.service.AuthService;
import com.genai.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

	private AuthService authService;
	private UserService userService;
	
	@PostMapping("/signup")
	private ResponseEntity<AuthResponse> signup(SignupRequest request){
		return ResponseEntity.ok(authService.signup(request));	
	}
	
	@PostMapping("/login")
	public ResponseEntity<AuthResponse> login(LoginRequest request)
	{
		return ResponseEntity.ok(authService.login(request));
	}
	
	@GetMapping("/me")
	public ResponseEntity<UserProfileResponse> getProfile()
	{
		Long userId = 1L;
		return ResponseEntity.ok(userService.getProfile(userId));
	}
}
