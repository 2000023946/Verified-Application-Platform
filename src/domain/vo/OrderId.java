package domain.vo;

import java.util.Objects;
import java.util.UUID;

public final class OrderId {
    private final UUID value;

    private OrderId(UUID value) {
        this.value = Objects.requireNonNull(value, "OrderId cannot be null");
    }

    public static OrderId of(UUID value) {
        return new OrderId(value);
    }

    public static OrderId random() {
        return new OrderId(UUID.randomUUID());
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof OrderId))
            return false;
        OrderId that = (OrderId) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
