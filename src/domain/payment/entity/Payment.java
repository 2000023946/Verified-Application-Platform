package domain.payment.entity;

import domain.vo.Money;
import domain.payment.state.PaymentState;

public final class Payment<S extends PaymentState> {
    private final Money amount;

    private Payment(Money amount) {
        this.amount = amount;
    }

    public static <S extends PaymentState> Payment<S> of(Money amount) {
        return new Payment<>(amount);
    }

    @Override
    public String toString() {
        return "Payment{amount=" + amount + "}";
    }
}
