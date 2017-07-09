package com.bubba.database.objects;

import javax.persistence.*;

import lombok.Data;

/**
 * Created by haller on 28.06.2017.
 */
@Entity
@Data
public class Score {

    @Id
    @GeneratedValue
    Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Player player;
    @ManyToOne(cascade = CascadeType.ALL)
    private Faction fraction;
    @ManyToOne(cascade = CascadeType.ALL)
    private Session session;
    private int score;

    private Score() {
    }

    public Score(Player player, Faction fraction, Session session, int score) {
        this.session = session;
        this.player = player;
        this.fraction = fraction;
        this.score = score;
    }
}
