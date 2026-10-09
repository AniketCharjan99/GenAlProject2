package com.genai.service;

import com.genai.dto.auth.AuthResponse;
import com.genai.dto.auth.LoginRequest;
import com.genai.dto.auth.SignupRequest;

public interface AuthService {

	AuthResponse signup(SignupRequest request);

	AuthResponse login(LoginRequest request);
	
}
