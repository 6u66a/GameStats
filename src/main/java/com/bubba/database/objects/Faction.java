package com.bubba.database.objects;

import javax.persistence.*;

import lombok.Data;

import java.util.Set;

/**
 * Created by haller on 27.06.2017.
 */
@Data
@Entity
public class Faction {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    private Game game;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Score> scores;

    private Faction() {
    }

    public Faction(String name, String description, Game game) {
        this.name = name;
        this.description = description;
        this.game = game;
    }

    public Long getId(){
        return this.id;
    }
}