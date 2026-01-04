package domain.order.entity;

import domain.vo.OrderId;
import domain.vo.Money;

public final class OrderCancelled extends Order {
    protected OrderCancelled(OrderId id, Money total) {
        super(id, total);
    }

    @Override
    public String toString() {
        return "OrderCancelled{id=" + id + ", total=" + total + "}";
    }
}
