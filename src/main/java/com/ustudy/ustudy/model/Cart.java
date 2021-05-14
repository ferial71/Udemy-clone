package com.ustudy.ustudy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "carts")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Cart extends AbstractEntity<Long>{

    @Column
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column
    @ManyToMany
    @JoinColumn(name = "client_id")
    private Set<Course> courses = new HashSet<>();
}
