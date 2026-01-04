package ports.order;

import domain.order.entity.OrderCancelled;
import domain.order.entity.OrderDraft;
import domain.order.entity.OrderFulfilled;
import domain.order.entity.OrderPaid;
import domain.vo.OrderId;

import java.util.Optional;

public interface OrderRepository {
    Optional<OrderDraft> findDraft(OrderId id);

    Optional<OrderPaid> findPaid(OrderId id);

    Optional<OrderFulfilled> findFulfilled(OrderId id);

    Optional<OrderCancelled> findCancelled(OrderId id);

    void save(OrderDraft order);

    void save(OrderPaid order);

    void save(OrderFulfilled order);

    void save(OrderCancelled order);
}
