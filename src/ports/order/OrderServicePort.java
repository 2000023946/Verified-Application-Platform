package ports.order;

import domain.order.entity.*;
import domain.order.proof.FulfillmentProof;
import domain.order.proof.CancellationProof;
import domain.payment.entity.PaymentAuthorized;
import domain.payment.proof.AuthorizedPaymentProof;

public interface OrderServicePort {

    OrderPaid payOrder(OrderDraft draft, PaymentAuthorized payment, AuthorizedPaymentProof proof);

    OrderCancelled cancelOrder(OrderDraft draft, CancellationProof proof);

    OrderFulfilled fulfillOrder(OrderPaid paid, FulfillmentProof proof);
}
