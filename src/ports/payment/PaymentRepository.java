package ports.payment;

import domain.payment.entity.*;

import java.util.Optional;

public interface PaymentRepository {
    Optional<PaymentPending> findPending(String id);

    Optional<PaymentAuthorized> findAuthorized(String id);

    Optional<PaymentCaptured> findCaptured(String id);

    Optional<PaymentRefunded> findRefunded(String id);

    Optional<PaymentFailed> findFailed(String id);

    void save(PaymentPending payment);

    void save(PaymentAuthorized payment);

    void save(PaymentCaptured payment);

    void save(PaymentRefunded payment);

    void save(PaymentFailed payment);
}
