package com.bubba.database.objects;

import javax.persistence.*;

import lombok.Data;

import java.util.Set;

/**
 * Created by haller on 27.06.2017.
 */
@Data
@Entity
public class Fraction {

    @Id
    @GeneratedValue
    Long id;
    private String name;
    private String description;
    @ManyToOne
    private Game game;
    @OneToMany
    private Set<Score> scores;

    private Fraction() {
    }

    public Fraction(String name, String description, Game game) {
        this.name = name;
        this.description = description;
        this.game = game;
    }
}