package domain.payment.proof;

import domain.vo.Money;

public final class RefundPaymentProof implements PaymentProof {
    private final Money amount;

    public RefundPaymentProof(Money amount) {
        this.amount = amount;
    }

    public Money getAmount() {
        return amount;
    }
}
