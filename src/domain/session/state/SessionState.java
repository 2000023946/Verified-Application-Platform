package domain.session.state;

// src/domain/session/state/SessionState.java

public sealed interface SessionState
        permits Active, Expired, Terminated {
}
