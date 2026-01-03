// src/domain/order/state/OrderState.java
package domain.order.state;

public sealed interface OrderState
        permits Draft, Paid, Captured, Fulfilled, Cancelled {
}
