package com.ustudy.ustudy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Table(name = "order_items")
public class OrderItem extends AbstractEntity<Long>{

    @Column
    private String price;

    @Column
    private String quantity;

}
