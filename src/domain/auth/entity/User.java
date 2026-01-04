package domain.auth.entity;

import domain.vo.UserId;
import domain.vo.Email;
import domain.auth.state.AuthenticationState;

public final class User<S extends AuthenticationState> {
    private final UserId id;
    private final Email email;

    private User(UserId id, Email email) {
        this.id = id;
        this.email = email;
    }

    public static <S extends AuthenticationState> User<S> create(UserId id, Email email) {
        return new User<>(id, email);
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", email=" + email + "}";
    }
}
