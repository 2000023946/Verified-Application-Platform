package ports.auth;

import domain.auth.entity.UserAuthenticated;
import domain.auth.entity.UserUnauthenticated;
import domain.vo.UserId;
import java.util.Optional;

public interface UserRepository {
    Optional<UserAuthenticated> findAuthenticated(UserId id);

    Optional<UserUnauthenticated> findUnauthenticated(UserId id);

    void saveAuthenticated(UserAuthenticated user);

    void saveUnauthenticated(UserUnauthenticated user);
}
