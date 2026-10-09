package com.genai.service;

import java.util.List;

import com.genai.dto.project.ProjectRequest;
import com.genai.dto.project.ProjectResponse;
import com.genai.dto.project.ProjectSummaryResponse;

public interface ProjectService {

	List<ProjectSummaryResponse> getUserProjects(Long userId);

	ProjectResponse getUserProjectById(Long id, Long userId);

	ProjectResponse createProject(ProjectRequest request, Long userId);

	ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

	void softDelete(Long id, Long userId);

}
