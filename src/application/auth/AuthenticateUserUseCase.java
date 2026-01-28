package application.auth;

import domain.auth.entity.UserAuthenticated;
import domain.auth.entity.UserUnauthenticated;
import domain.auth.proof.AuthProof;
import ports.auth.AuthServicePort;
import ports.auth.UserRepository;

public final class AuthenticateUserUseCase {

    private final AuthServicePort authService;
    private final UserRepository users;

    public AuthenticateUserUseCase(
            AuthServicePort authService,
            UserRepository users) {
        this.authService = authService;
        this.users = users;
    }

    public UserAuthenticated execute(
            UserUnauthenticated user,
            AuthProof proof) {
        UserAuthenticated authenticated = authService.authenticate(user, proof);

        users.saveAuthenticated(authenticated);

        return authenticated;
    }
}
