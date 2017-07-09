package com.bubba.games;

import com.bubba.database.objects.Game;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by haller on 12.04.2017.
 */
public interface GameRepository extends CrudRepository<Game, Long> {
}
