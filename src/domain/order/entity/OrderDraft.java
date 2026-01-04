package domain.order.entity;

import domain.vo.OrderId;
import domain.payment.entity.PaymentAuthorized;
import domain.vo.Money;

public final class OrderDraft extends Order {

    protected OrderDraft(OrderId id, Money total) {
        super(id, total);
    }

    // Draft -> Paid
    public OrderPaid pay(PaymentAuthorized payment) {
        return new OrderPaid(id, total);
    }

    // Draft -> Cancelled
    public OrderCancelled cancel() {
        return new OrderCancelled(id, total);
    }

    @Override
    public String toString() {
        return "OrderDraft{id=" + id + ", total=" + total + "}";
    }
}
