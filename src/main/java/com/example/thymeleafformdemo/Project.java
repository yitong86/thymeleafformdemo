package com.example.thymeleafformdemo;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
@NoArgsConstructor
public class Project implements Serializable {

    private Long id;
    private String title;
    private String type;
    private String color;
    private String description;
    private Integer days;
    private Double price;
    private Boolean featured;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime launchDate;

    public Project(Long id, String title, String type, String color, String description, Integer days, Double price, Boolean featured, LocalDateTime launchDate) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.color = color;
        this.description = description;
        this.days = days;
        this.price = price;
        this.featured = featured;
        this.launchDate = launchDate;
    }


/*
    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", description='" + description + '\'' +
                ", days=" + days +
                ", price=" + price +
                ", featured=" + featured +
                ", launchDate=" + launchDate +
                '}';
    }
    */
}