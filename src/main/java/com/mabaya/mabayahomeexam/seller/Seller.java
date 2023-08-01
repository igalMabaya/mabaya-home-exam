package com.mabaya.mabayahomeexam.seller;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller")
public class Seller {

    @Id
    private Long id;

    @Column
    private String name;

    @Column(nullable = true)
    @NotNull
    private String description;

    public Seller(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Seller() {

    }
}
