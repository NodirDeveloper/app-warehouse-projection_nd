package com.example.appwarehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private long amount;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private Date expireDate;

    @ManyToOne(optional = false)
    private Input input;



}
