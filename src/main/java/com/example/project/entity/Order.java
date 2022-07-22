package com.example.project.entity;

import com.example.project.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order extends BaseEntity {
    private String name;
    private String email;
    private String address;
    private int phone;
    private String gender;
    private BigDecimal total_order;
    private String name_product;
    private int qty;
    private BigDecimal price;
    private BigDecimal paid;
    private BigDecimal unpaid;
}
