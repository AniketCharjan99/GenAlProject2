package com.genai.entity;

import java.time.Instant;

import com.genai.enums.ProjectRole;

public class ProjectMember {

	ProjectMemberId id;
	
	Project project;
	
	User user;
	
	ProjectRole projectRole;
	
	Instant invitedAt;
	
	Instant acceptedAt;

}
