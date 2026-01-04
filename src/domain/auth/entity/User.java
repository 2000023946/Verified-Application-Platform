package domain.auth.entity;

import domain.vo.UserId;
import domain.vo.Email;

public abstract sealed class User permits UserUnauthenticated, UserAuthenticated {
    protected final UserId id;
    protected final Email email;

    protected User(UserId id, Email email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{id=" + id + ", email=" + email + "}";
    }
}
