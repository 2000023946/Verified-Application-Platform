package domain.session.entity;

import domain.vo.UserId;

public final class SessionTerminated extends Session {

    public SessionTerminated(UserId userId) {
        super(userId);
    }

    @Override
    public String toString() {
        return "SessionTerminated{userId=" + userId + "}";
    }
}
