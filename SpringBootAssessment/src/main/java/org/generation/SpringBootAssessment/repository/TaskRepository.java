package org.generation.SpringBootAssessment.repository;

import org.generation.SpringBootAssessment.repository.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer>
{}