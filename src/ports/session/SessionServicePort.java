package ports.session;

import domain.session.entity.*;
import domain.auth.entity.UserAuthenticated;
import domain.session.proof.AuthenticatedSessionProof;

public interface SessionServicePort {
    SessionActive createSession(UserAuthenticated user, AuthenticatedSessionProof proof);
    SessionExpired expireSession(SessionActive active, String reason);
    SessionTerminated terminateSession(SessionActive active, String reason);
}
