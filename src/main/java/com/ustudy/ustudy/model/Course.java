package com.ustudy.ustudy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Table(name = "courses")
public class Course extends AbstractEntity<Long>{

    @Column
    private String title;

    @Column
    private String subTitle;

    @Column
    private String price;

    @Column
    private int rating;

    @Column
    private int ratingCount;

    @Column
    private Set<Language> languages = new HashSet<>();

    @Column
    private Set<String> learningGoals = new HashSet<>();

    @Column
    private Set<String> requirements = new HashSet<>();

    @Column
    private String description;

    @Column
    private String index;

    @Column
    private String teacher;

    @Column
    private String audience;

    @Column
    private String picture;

    @Column
    @ManyToMany
    private Set<Cart> carts = new HashSet<>();

    @Column
    @ManyToMany
    private Set<Category> categories = new HashSet<>();

    @Column
    @OneToMany
    private Set<Video> videos = new HashSet<>();

    @Column
    @OneToMany(mappedBy = "course")
    private Set<Promotion> promotions = new HashSet<>();

}
