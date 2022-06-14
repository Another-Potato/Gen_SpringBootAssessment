package org.generation.SpringBootAssessment.repository.entity;

import org.generation.SpringBootAssessment.controller.dto.TaskDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskid;
    private String title;
    private String description;
    private String target;

    public Task(TaskDTO taskDto) {
        this.title = taskDto.getTitle();
        this.description = taskDto.getDescription();
        this.target = taskDto.getTargetDeadline();
    }

    public Integer getTaskid() {return taskid;}
    public String getTitle() {return title;}
    public String getDescription() {return description;}
    public String getTarget() {return target;}

    public void setTitle(String title) {this.title = title;}
    public void setDescription(String description) {this.description = description;}
    public void setTarget(String target) {this.target = target;}

    @Override
    public String toString() {
        return String.format("Task{id=%d, title='%s', description='%s', target='%s' }",taskid,title,description,target);
    }
}
