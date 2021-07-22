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
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String factureNumber;

    @ManyToOne(optional = false)
    private WareHouse wareHouse;

    @ManyToOne(optional = false)
    private Currency currency;

    @ManyToOne(optional = false)
    private Client client;



}
