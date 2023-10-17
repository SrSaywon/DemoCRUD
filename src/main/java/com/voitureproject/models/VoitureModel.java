package com.voitureproject.models;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;


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
