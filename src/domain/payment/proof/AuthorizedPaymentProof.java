package domain.payment.proof;

import domain.vo.Money;

public final class AuthorizedPaymentProof implements PaymentProof {
    private final Money amount;

    public AuthorizedPaymentProof(Money amount) {
        this.amount = amount;
    }

    public Money getAmount() {
        return amount;
    }
}
