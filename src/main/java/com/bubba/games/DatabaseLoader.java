package com.bubba.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by haller on 12.04.2017.
 */
@Component //to be detected by component scan
public class DatabaseLoader implements CommandLineRunner { //CommandLineRunner, will be run after all beans have been created
    private final GameRepository gameRepository;
    private final FractionRepository fractionRepository;
    private final PlayerRepository playerRepository;
    private final ScoreRepository scoreRepository;
    private final SessionRepository sessionRepository;

    @Autowired //contructor injection
    public DatabaseLoader(GameRepository repository, FractionRepository fractionRepository, PlayerRepository playerRepository,
            ScoreRepository scoreRepository, SessionRepository sessionRepository) {
        this.gameRepository =repository;
        this.fractionRepository=fractionRepository;
        this.playerRepository = playerRepository;
        this.scoreRepository = scoreRepository;
        this.sessionRepository = sessionRepository;
    }

    @Override
    public void run(String... strings) throws Exception { //command line args to load data
        /*Game game = this.gameRepository.save(new Game("chess", "Florian likes to play it"));
        Set<Fraction> fractions = new HashSet<>();
        Fraction fac = this.fractionRepository.save(new Fraction("Good","The good guys", game));
        fractions.add(fac);*/
    }
}
