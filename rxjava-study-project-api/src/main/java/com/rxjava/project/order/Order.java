package com.rxjava.project.order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name="OrderInfo")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int orderCode;
    int uerCode;
    int itemCode;
    String itemName;
    int discountPrice;
    int payPrice;
    String orderDate;
    String orderState;
    String invoiceNumber;

}
