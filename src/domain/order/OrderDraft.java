package domain.order;

import domain.vo.OrderId;
import domain.vo.Money;
import domain.payment.PaymentAuthorized;

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
