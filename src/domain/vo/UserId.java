package domain.vo;

import java.util.Objects;
import java.util.UUID;

public final class UserId {
    private final UUID value;

    private UserId(UUID value) {
        this.value = Objects.requireNonNull(value, "UserId cannot be null");
    }

    public static UserId of(UUID value) {
        return new UserId(value);
    }

    public static UserId random() {
        return new UserId(UUID.randomUUID());
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof UserId))
            return false;
        UserId that = (UserId) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
