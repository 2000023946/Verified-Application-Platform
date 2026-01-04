package domain.payment.proof;

import domain.vo.Money;

public final class CapturedPaymentProof implements PaymentProof {
    private final Money amount;

    public CapturedPaymentProof(Money amount) {
        this.amount = amount;
    }

    public Money getAmount() {
        return amount;
    }
}
