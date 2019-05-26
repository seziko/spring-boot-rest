package com.bilgeadam.example.springbootrest.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

//@Getter
//@Setter
//@ToString(exclude = {"id"})
//@EqualsAndHashCode
//NoArgsConstructor
//@AllArgsConstructor
@Data
@MappedSuperclass
public abstract class BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date")
    private Date createDate=new Date();

    protected BaseEntity(){


        }

}
