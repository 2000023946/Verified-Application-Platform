package domain.order.proof;

public sealed interface OrderProof
        permits PaymentCompletedProof, CancellationProof, FulfillmentProof {
}
