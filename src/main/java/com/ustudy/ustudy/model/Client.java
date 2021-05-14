package com.ustudy.ustudy.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Table(name = "clients")
public class Client extends AbstractEntity<Long>{

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String sessionToken;

    @Column
    private String password;

    @Column
    private String phone;

    @Column
    @Enumerated(EnumType.STRING)
    private ClientStatus status = ClientStatus.Not_active;

    @Column
    @Enumerated(EnumType.STRING)
    private ClientRole role = ClientRole.Client;

    @Column
    @OneToMany(mappedBy = "client")
    private Set<Cart> carts = new HashSet<>();

    @Column
    @OneToMany(mappedBy = "client")
    private Set<Order> orders = new HashSet<>();

}
