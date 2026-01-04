package application.payment;

import domain.payment.entity.PaymentAuthorized;
import domain.payment.entity.PaymentPending;
import domain.payment.proof.AuthorizedPaymentProof;
import ports.payment.PaymentRepository;
import ports.payment.PaymentServicePort;

public final class AuthorizePaymentUseCase {

    private final PaymentServicePort payments;
    private final PaymentRepository repository;

    public AuthorizePaymentUseCase(
            PaymentServicePort payments,
            PaymentRepository repository) {
        this.payments = payments;
        this.repository = repository;
    }

    public PaymentAuthorized execute(
            PaymentPending pending,
            AuthorizedPaymentProof proof) {
        PaymentAuthorized authorized = payments.authorize(pending, proof);

        repository.save(authorized);

        return authorized;
    }
}
