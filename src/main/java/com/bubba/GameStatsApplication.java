package com.bubba;

import com.bubba.database.objects.Faction;
import com.bubba.database.objects.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@SpringBootApplication
public class GameStatsApplication extends RepositoryRestConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(GameStatsApplication.class, args);
	}

	@Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	    config.exposeIdsFor(Faction.class, Game.class);
    }
}
