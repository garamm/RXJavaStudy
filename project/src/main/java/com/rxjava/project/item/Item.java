package com.rxjava.project.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name="ItemInfo")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int itemCode;
    int groupCode;
    String itemName;
    int itemPrice;

}
