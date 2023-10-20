package com.javarush.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@Data
@Entity
@Table(schema = "world", name = "country_language")
public class CountryLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "language", length = 30, nullable = false)
    private String language;

    @Column(name = "is_official", nullable = false, columnDefinition = "BIT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean official;

    @Column(name = "percentage", nullable = false)
    private BigDecimal percentage;

}
