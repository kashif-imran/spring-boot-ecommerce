package com.kashif.ecommerce.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="state")
@Data
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "state_id_gen")
    @SequenceGenerator(name = "state_id_gen", sequenceName = "state_id_seq", allocationSize = 1)
    private int id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;

}












