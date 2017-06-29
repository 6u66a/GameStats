package com.bubba.database.objects;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;

/**
 * Created by haller on 12.04.2017.
 */
@Data
@Entity
public class Game {

    @Id @GeneratedValue Long id;
    protected String name;
    protected String description;
    @OneToMany
    protected List<Fraction> fractions;
    @OneToMany
    protected Set<Session> sessions;

    private Game() {}

    public Game(String name, String description, List<Fraction> fractions) {
        this.name=name;
        this.description=description;
        this.fractions=fractions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fraction")
    public List<Fraction> getFractions(){
        return this.fractions;
    }
}
