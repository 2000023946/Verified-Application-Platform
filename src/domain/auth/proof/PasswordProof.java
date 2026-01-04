package domain.auth.proof;

public final class PasswordProof implements AuthProof {
    private final String passwordHash;

    public PasswordProof(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}
