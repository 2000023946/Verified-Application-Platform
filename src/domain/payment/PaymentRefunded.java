package domain.payment;

import domain.vo.Money;

public final class PaymentRefunded extends Payment {

    public PaymentRefunded(Money amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "PaymentRefunded{amount=" + amount + "}";
    }
}
