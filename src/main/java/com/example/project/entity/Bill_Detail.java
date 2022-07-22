package com.example.project.entity;

import com.example.project.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bill_details")
public class Bill_Detail extends BaseEntity{
    private int quantity;
    private BigDecimal price;
}
