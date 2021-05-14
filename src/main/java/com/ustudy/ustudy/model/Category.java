package com.ustudy.ustudy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = false, callSuper = true)
@Table(name = "categories")
public class Category extends AbstractEntity<Long>{

    @Column
    private String name;

    @Column
    private String image;

    @Column
    private String description;

    @Column
    @ManyToMany
    private Set<Course> courses = new HashSet<>();

}
