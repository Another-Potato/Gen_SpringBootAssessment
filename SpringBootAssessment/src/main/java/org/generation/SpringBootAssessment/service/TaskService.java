package org.generation.SpringBootAssessment.service;

import org.generation.SpringBootAssessment.repository.entity.Task;
import java.util.List;

public interface TaskService {
    Task save(Task task);
    void delete(int taskId);
    List<Task> all();
    Task findById(int taskId);
}
