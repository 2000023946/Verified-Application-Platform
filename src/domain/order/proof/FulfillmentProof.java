package domain.order.proof;

public final class FulfillmentProof implements OrderProof {
    private final String fulfillmentId;

    public FulfillmentProof(String fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
    }

    public String getFulfillmentId() {
        return fulfillmentId;
    }
}
