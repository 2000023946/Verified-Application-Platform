package domain.session.proof;

public final class ExpiredSessionProof implements SessionProof {
    private final String reason;

    public ExpiredSessionProof(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
