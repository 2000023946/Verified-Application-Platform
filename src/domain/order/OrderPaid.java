package domain.order;

import domain.vo.OrderId;
import domain.vo.Money;

public final class OrderPaid extends Order {

    protected OrderPaid(OrderId id, Money total) {
        super(id, total);
    }

    // Paid -> Fulfilled
    public OrderFulfilled fulfill() {
        return new OrderFulfilled(id, total);
    }

    // Paid -> Cancelled
    public OrderCancelled cancel() {
        return new OrderCancelled(id, total);
    }

    @Override
    public String toString() {
        return "OrderPaid{id=" + id + ", total=" + total + "}";
    }
}
