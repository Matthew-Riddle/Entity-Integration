package com.cooksys.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.cooksys.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

	List<Project> findByDueDateLessThan(Date dueDate);
	
	List<Project> findByManagerId(Long id);
	
}
