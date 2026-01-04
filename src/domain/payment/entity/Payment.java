package domain.payment.entity;

import domain.vo.Money;

public abstract sealed class Payment
        permits PaymentPending, PaymentAuthorized, PaymentCaptured, PaymentRefunded, PaymentFailed {
    protected final Money amount;

    protected Payment(Money amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{amount=" + amount + "}";
    }
}
