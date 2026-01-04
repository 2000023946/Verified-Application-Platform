package domain.payment.entity;

import domain.vo.Money;

public final class PaymentFailed extends Payment {
    public PaymentFailed(Money amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "PaymentFailed{amount=" + amount + "}";
    }
}
