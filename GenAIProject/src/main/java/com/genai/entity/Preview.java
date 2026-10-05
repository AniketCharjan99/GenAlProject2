package com.genai.entity;

import java.time.Instant;

import com.genai.enums.PreviewStatus;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {
	
	Long id;
	
	Project project;
	
	String namespace;
	String podName;
	String previewUrl;
	
	PreviewStatus status;
	
	Instant startedAt;
	Instant terminatedAt;
	Instant createdAt;
	
}
