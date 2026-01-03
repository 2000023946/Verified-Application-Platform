// src/domain/auth/state/AuthenticationState.java
package domain.auth.state;

public sealed interface AuthenticationState
                permits Unauthenticated, Authenticated {
}
