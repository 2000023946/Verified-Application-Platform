package ports.payment;

import domain.payment.entity.*;
import domain.payment.proof.AuthorizedPaymentProof;
import domain.payment.proof.CapturedPaymentProof;
import domain.payment.proof.RefundPaymentProof;

public interface PaymentServicePort {
    PaymentAuthorized authorize(
            PaymentPending pending,
            AuthorizedPaymentProof proof);

    PaymentCaptured capture(
            PaymentAuthorized authorized,
            CapturedPaymentProof proof);

    PaymentRefunded refund(
            PaymentCaptured captured,
            RefundPaymentProof proof);
}
