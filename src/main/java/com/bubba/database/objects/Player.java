package com.bubba.database.objects;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by haller on 28.06.2017.
 */
@Data
@Entity
public class Player {

    @Id @GeneratedValue long id;
    private String name;
    @OneToMany
    private Set<Score> scores;

    private Player(){}

    public Player(String name){
        this.name=name;
    }
}
