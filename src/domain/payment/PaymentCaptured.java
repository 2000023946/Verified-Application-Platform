package domain.payment;

import domain.vo.Money;

public final class PaymentCaptured extends Payment {
    public PaymentCaptured(Money amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "PaymentCaptured{amount=" + amount + "}";
    }
}
