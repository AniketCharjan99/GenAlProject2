package com.genai.dto.auth;

public record AuthResponse(String token,UserProfileResponse profileResponse) 
{

}

// dummy: new AuthResponse("", new UserProfileResponse());


