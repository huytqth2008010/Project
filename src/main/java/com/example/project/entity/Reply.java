package com.example.project.entity;

import com.example.project.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "replys")
public class Reply extends BaseEntity {
    private String content;
}
