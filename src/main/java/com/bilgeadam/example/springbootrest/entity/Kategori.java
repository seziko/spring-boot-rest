package com.bilgeadam.example.springbootrest.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "kategori")
public class Kategori extends BaseEntity{

    @Column(name = "baslik",nullable = false,length = 15)
    private String baslik;
    @Column(name = "tur")
    private String tur;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kitap_id",nullable = false)
    private Kitap kitap;


}
