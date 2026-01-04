package domain.session.proof;

public final class TerminatedSessionProof implements SessionProof {
    private final String reason;

    public TerminatedSessionProof(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
