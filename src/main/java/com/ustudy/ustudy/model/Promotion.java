package com.ustudy.ustudy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Table(name = "promotions")
public class Promotion extends AbstractEntity<Long>{

    @Column
    private String name;

    @Column
    private float value;

    @Column
    private String description;

    @Column
    private String code;

    @Column
    private String useNumber;

    @Column
    private Date start;

    @Column
    private Date end;

    @Column
    @ManyToMany
    private Set<Course> course= new HashSet<>();

}
