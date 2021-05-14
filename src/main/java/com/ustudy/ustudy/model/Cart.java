package com.ustudy.ustudy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Table(name = "cart")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Cart extends AbstractEntity<Long>{

    @Column
    private int quantity;

    @Column
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column
    @ManyToMany
    @JoinColumn(name = "client_id")
    private Set<Course> courses = new HashSet<>();
}
