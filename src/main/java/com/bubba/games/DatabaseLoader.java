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
    private final SessionRepository sessionRepository;

    @Autowired //contructor injection
    public DatabaseLoader(GameRepository repository, SessionRepository sessionRepository) {
        this.gameRepository = repository;
        this.sessionRepository = sessionRepository;
    }

    @Override
    public void run(String... strings) throws Exception { //command line args to load data
        /*Game game = this.gameRepository.save(new Game("chess", "Florian likes to play it"));
        Set<Fraction> factions = new HashSet<>();
        Fraction fac = this.fractionRepository.save(new Fraction("Good","The good guys", game));
        factions.add(fac);*/
    }
}
