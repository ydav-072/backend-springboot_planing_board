package ru.studyfullstack.tasklist.backendspringboot.entity;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Setter
@EqualsAndHashCode
@Table(name = "task", schema = "task_list")
public class TaskEntity {
    private Long id;
    private String title;
    private Integer completed;
    private Date date;
    private PriorityEntity priority;
    private CategoryEntity category;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Basic
    @Column(name = "completed")
    public Integer getCompleted() {
        return completed;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    @ManyToOne
    @JoinColumn(name = "priority_id")
    public PriorityEntity getPriority() {
        return priority;
    }

    @ManyToOne
    @JoinColumn(name = "category_id")
    public CategoryEntity getCategory() {
        return category;
    }

}
