package com.bubba.database.objects;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by haller on 28.06.2017.
 */
@Entity
@Data
public class Score {

    @Id
    @GeneratedValue
    Long id;
    @ManyToOne
    private Player player;
    @ManyToOne
    private Fraction fraction;
    @ManyToOne
    private Session session;
    private int score;

    private Score() {
    }

    public Score(Player player, Fraction fraction, Session session, int score) {
        this.session = session;
        this.player = player;
        this.fraction = fraction;
        this.score = score;
    }
}
