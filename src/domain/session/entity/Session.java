package domain.session.entity;

import domain.vo.UserId;

public abstract sealed class Session permits SessionActive, SessionExpired, SessionTerminated {
    protected final UserId userId;

    protected Session(UserId userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{userId=" + userId + "}";
    }
}
