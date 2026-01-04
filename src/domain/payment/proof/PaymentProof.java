package domain.payment.proof;

public sealed interface PaymentProof
        permits AuthorizedPaymentProof, CapturedPaymentProof, RefundPaymentProof {
}
