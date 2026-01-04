package domain.auth;

import domain.vo.UserId;
import domain.vo.Email;

public final class UserUnauthenticated extends User {

    public UserUnauthenticated(UserId id, Email email) {
        super(id, email);
    }

    public UserAuthenticated authenticate() {
        return new UserAuthenticated(id, email);
    }

    @Override
    public String toString() {
        return "UserUnauthenticated{id=" + id + ", email=" + email + "}";
    }
}
