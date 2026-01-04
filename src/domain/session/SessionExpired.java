package domain.session;

import domain.vo.UserId;

public final class SessionExpired extends Session {

    public SessionExpired(UserId userId) {
        super(userId);
    }

    @Override
    public String toString() {
        return "SessionExpired{userId=" + userId + "}";
    }
}
