package domain.auth.entity;

import domain.vo.UserId;
import domain.vo.Email;

public final class UserAuthenticated extends User {

    public UserAuthenticated(UserId id, Email email) {
        super(id, email);
    }

    public UserUnauthenticated logout() {
        return new UserUnauthenticated(id, email);
    }

    @Override
    public String toString() {
        return "UserAuthenticated{id=" + id + ", email=" + email + "}";
    }
}
