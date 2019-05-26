package com.bilgeadam.example.springbootrest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "kitap")
public class Kitap extends BaseEntity{




    @Column(name = "adi",nullable = false,length = 20)
    private String adi;
    @Column(name = "yazari",nullable = false)
    private String yazari;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kitap_bilgi_id")
    private KitapBilgi kitapBilgi;



}
