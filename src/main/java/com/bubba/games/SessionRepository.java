package com.bubba.games;

import com.bubba.database.objects.Session;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by haller on 28.06.2017.
 */
public interface SessionRepository extends CrudRepository<Session, Long> {

}
