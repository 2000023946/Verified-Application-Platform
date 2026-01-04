package application.session;

import domain.auth.entity.UserAuthenticated;
import domain.session.entity.SessionActive;
import domain.session.proof.AuthenticatedSessionProof;
import ports.session.SessionRepository;
import ports.session.SessionServicePort;

public final class CreateSessionUseCase {

    private final SessionServicePort sessions;
    private final SessionRepository repository;

    public CreateSessionUseCase(
            SessionServicePort sessions,
            SessionRepository repository) {
        this.sessions = sessions;
        this.repository = repository;
    }

    public SessionActive execute(
            UserAuthenticated user,
            AuthenticatedSessionProof proof) {
        SessionActive session = sessions.createSession(user, proof);
        repository.save(session);
        return session;
    }
}
