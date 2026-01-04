package domain.order.entity;

import domain.vo.OrderId;
import domain.vo.Money;
import domain.order.state.OrderState;

public final class Order<S extends OrderState> {
    private final OrderId id;
    private final Money total;

    private Order(OrderId id, Money total) {
        this.id = id;
        this.total = total;
    }

    public static <S extends OrderState> Order<S> create(OrderId id, Money total) {
        return new Order<>(id, total);
    }

    @Override
    public String toString() {
        return "Order{id=" + id + ", total=" + total + "}";
    }
}
