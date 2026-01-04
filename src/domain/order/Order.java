package domain.order;

import domain.vo.OrderId;
import domain.vo.Money;

// Sealed base class
public abstract sealed class Order permits OrderDraft, OrderPaid, OrderFulfilled, OrderCancelled {
    protected final OrderId id;
    protected final Money total;

    protected Order(OrderId id, Money total) {
        this.id = id;
        this.total = total;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{id=" + id + ", total=" + total + "}";
    }
}
