package com.mabaya.mabayahomeexam.seller;

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

    public Seller(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Seller() {

    }
}
