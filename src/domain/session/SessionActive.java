package domain.session;

import domain.vo.UserId;

public final class SessionActive extends Session {

    public SessionActive(UserId userId) {
        super(userId);
    }

    public SessionExpired expire() {
        return new SessionExpired(userId);
    }

    public SessionTerminated terminate() {
        return new SessionTerminated(userId);
    }

    @Override
    public String toString() {
        return "SessionActive{userId=" + userId + "}";
    }
}
