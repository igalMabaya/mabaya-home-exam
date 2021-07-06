package com.mabaya.mabayahomeexam.campaign;


import com.mabaya.mabayahomeexam.seller.Seller;

import javax.persistence.*;

@Entity
@Table(name = "campaign")
public class Campaign {

    @Id
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    public Campaign(Long id, String name, Seller seller) {
        this.id = id;
        this.name = name;
        this.seller = seller;
    }

    public Campaign() {

    }
}
