package com.voitureproject.models;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
@Table(name = "voiture")
@Entity
public class VoitureModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String color;

    private int year;

    public VoitureModel(Long id, String brand, String color, int year) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public VoitureModel() {

    }
}
