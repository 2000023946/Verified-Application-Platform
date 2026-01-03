// src/domain/payment/state/PaymentState.java
package domain.payment.state;

public sealed interface PaymentState
        permits Pending, Authorized, Captured, Refunded, Failed {
}
