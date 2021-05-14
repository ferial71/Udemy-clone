package com.ustudy.ustudy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Table(name = "orders")
public class Order extends AbstractEntity<Long>{

    @Column
    private String number;

    @Column
    private String currency;

    @Column
    private String billingAddress;

    @Column
    private String shippingAddress;

    @Column
    @Enumerated(EnumType.STRING)
    private OrderStatus status = OrderStatus.WAITING_FOR_PAYMENT;

    @Column
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType = PaymentType.CREDIT_CARD;

    @Column
    @ManyToOne
    private Client client;

}
