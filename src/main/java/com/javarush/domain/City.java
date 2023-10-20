package com.javarush.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "world", name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 35, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "district", length = 20, nullable = false)
    private String district;

    @Column(name = "population", nullable = false)
    private Integer population;

}
