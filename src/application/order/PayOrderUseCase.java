package application.order;

import domain.order.entity.OrderPaid;
import domain.order.entity.OrderDraft;
import domain.payment.entity.PaymentAuthorized;
import ports.order.OrderRepository;

public final class PayOrderUseCase {

    private final OrderRepository orders;

    public PayOrderUseCase(OrderRepository orders) {
        this.orders = orders;
    }

    public OrderPaid execute(
            OrderDraft order,
            PaymentAuthorized payment) {
        OrderPaid paid = order.pay(payment);
        orders.save(paid);
        return paid;
    }
}
