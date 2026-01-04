package domain.order.proof;

public final class CancellationProof implements OrderProof {
    private final String reason;

    public CancellationProof(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
}
