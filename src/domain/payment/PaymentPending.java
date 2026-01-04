package domain.payment;

import domain.vo.Money;

public final class PaymentPending extends Payment {

    public PaymentPending(Money amount) {
        super(amount);
    }

    public PaymentAuthorized authorize() {
        return new PaymentAuthorized(amount);
    }

    public PaymentFailed fail() {
        return new PaymentFailed(amount);
    }

    @Override
    public String toString() {
        return "PaymentPending{amount=" + amount + "}";
    }
}
