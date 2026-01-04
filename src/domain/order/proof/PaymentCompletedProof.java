package domain.order.proof;

public final class PaymentCompletedProof implements OrderProof {
    private final String transactionId;

    public PaymentCompletedProof(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
