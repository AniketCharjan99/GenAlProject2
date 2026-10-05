package com.genai.entity;

import java.time.Instant;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

	private Long id;

	private String email;
	private String passordHash;
	private String name;

	private String avatarUrl;

	private Instant createdAt;
	private Instant updatedAt;
	private Instant deleteAt; //soft delete

}
