package com.genai.entity;

import java.time.Instant;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsageLog {
	
	Long id;
	User user;
	Project project;
	
	Project action;
	
	Integer tokensUsed;
	Integer durationMs;
	
	String metaData; //JSON of {model_used, prompt_used}
	
	Instant createdAt;
	
	
	
	

}
