package org.generation.SpringBootAssessment.controller.dto;

public class TaskDTO {

    private String title;
    private String description;
    private String targetDeadline;

    public TaskDTO(String title, String description, String targetDeadline) {
        this.title = title;
        this.description = description;
        this.targetDeadline = targetDeadline;
    }

    public String getTitle() {return title;}
    public String getDescription() {return description;}
    public String getTargetDeadline() {return targetDeadline;}

    public void setTitle(String title) {this.title = title;}
    public void setDescription(String description) {this.description = description;}
    public void setTargetDeadline(String targetDeadline) {this.targetDeadline = targetDeadline;}
}
