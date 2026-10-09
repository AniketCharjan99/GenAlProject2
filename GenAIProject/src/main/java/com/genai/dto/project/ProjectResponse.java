package com.genai.dto.project;

import java.time.Instant;

import com.genai.dto.auth.UserProfileResponse;

public record ProjectResponse(
		Long id,
		String name,
		Instant createdAt,
		Instant updatedAt,
		UserProfileResponse owner
		) {

}
