package domain.auth.proof;

public final class OAuthProof implements AuthProof {
    private final String token;

    public OAuthProof(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
