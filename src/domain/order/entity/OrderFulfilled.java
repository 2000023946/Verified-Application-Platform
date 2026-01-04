package domain.order.entity;

import domain.vo.OrderId;
import domain.vo.Money;

public final class OrderFulfilled extends Order {

    protected OrderFulfilled(OrderId id, Money total) {
        super(id, total);
    }

    @Override
    public String toString() {
        return "OrderFulfilled{id=" + id + ", total=" + total + "}";
    }
}
