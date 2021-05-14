package com.ustudy.ustudy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Table(name = "videos")
public class Video extends AbstractEntity<Long>{
    @Column
    private String title;

    @Column
    private String index;

    @Column
    private String url;

    @Column
    private float duration;


    @ManyToOne
    private Course course;


}
