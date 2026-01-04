package domain.session.proof;

public final class AuthenticatedSessionProof implements SessionProof {
    private final String sessionToken;

    public AuthenticatedSessionProof(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getSessionToken() {
        return sessionToken;
    }
}
