package com.genai.service;

import com.genai.dto.auth.UserProfileResponse;

public interface UserService {

	UserProfileResponse getProfile(Long userId);

}
