package com.bubba.database.objects;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by haller on 28.06.2017.
 */
@Data
@Entity
public class Session {

    @Id @GeneratedValue Long id;
    private String notes;
    private int duration;
    @ManyToOne(cascade = CascadeType.ALL)
    private Game game;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Score> scores;

    private Session(){}

    public Session(Game game, String notes, int duration){
        this.game=game;
        this.notes=notes;
        this.duration=duration;

    }


}
