package domain.payment;

import domain.vo.Money;

public final class PaymentAuthorized extends Payment {

    public PaymentAuthorized(Money amount) {
        super(amount);
    }

    public PaymentCaptured capture() {
        return new PaymentCaptured(amount);
    }

    public PaymentRefunded refund() {
        return new PaymentRefunded(amount);
    }

    @Override
    public String toString() {
        return "PaymentAuthorized{amount=" + amount + "}";
    }
}
