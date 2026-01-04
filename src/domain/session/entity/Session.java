package domain.session.entity;

import domain.vo.UserId;
import domain.session.state.SessionState;

public final class Session<S extends SessionState> {
    private final UserId userId;

    private Session(UserId userId) {
        this.userId = userId;
    }

    public static <S extends SessionState> Session<S> of(UserId userId) {
        return new Session<>(userId);
    }

    @Override
    public String toString() {
        return "Session{userId=" + userId + "}";
    }
}
