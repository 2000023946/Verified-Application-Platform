package ports.session;

import domain.session.entity.*;

import java.util.Optional;

public interface SessionRepository {
    Optional<SessionActive> findActive(String id);

    Optional<SessionExpired> findExpired(String id);

    Optional<SessionTerminated> findTerminated(String id);

    void save(SessionActive session);

    void save(SessionExpired session);

    void save(SessionTerminated session);
}
