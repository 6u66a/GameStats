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
    @OneToMany(cascade = CascadeType.ALL)
    protected List<Faction> factions;
    @OneToMany(cascade = CascadeType.ALL)
    protected Set<Session> sessions;

    private Game() {}

    public Game(String name, String description, List<Faction> factions) {
        this.name=name;
        this.description=description;
        this.factions=factions;
    }
}
