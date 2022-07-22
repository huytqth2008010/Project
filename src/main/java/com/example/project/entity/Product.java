package com.example.project.entity;

import com.example.project.entity.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    private String name;
    private String image;
    private String description;
    private BigDecimal unit_price;
    private BigDecimal promotion_price;
    private int qty;

    @ManyToOne
    @JoinColumn(name = "id_category", insertable = false, updatable = false)
    @JsonIgnore
    private Category category;
}
