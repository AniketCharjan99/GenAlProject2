package com.genai.entity;

import java.time.Instant;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {
	
	Long id;
	
	String name;
	
	User owner;
	
	Boolean isPublic = false;
	
	Instant createdAt;
	Instant updateAt;
	Instant deletedAt; //soft delete

}
