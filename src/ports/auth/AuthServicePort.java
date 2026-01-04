package ports.auth;

import domain.auth.entity.UserAuthenticated;
import domain.auth.entity.UserUnauthenticated;
import domain.auth.proof.AuthProof;

public interface AuthServicePort {
    UserAuthenticated authenticate(UserUnauthenticated user, AuthProof proof);

    UserUnauthenticated logout(UserAuthenticated user);
}
