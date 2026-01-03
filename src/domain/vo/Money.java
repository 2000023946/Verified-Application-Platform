package domain.vo;

import java.math.BigDecimal;
import java.util.Objects;

public final class Money {
    private final BigDecimal value;

    private Money(BigDecimal value) {
        Objects.requireNonNull(value, "Money value cannot be null");
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.value = value;
    }

    public static Money of(BigDecimal value) {
        return new Money(value);
    }

    public static Money of(double value) {
        return new Money(BigDecimal.valueOf(value));
    }

    public Money add(Money other) {
        return new Money(this.value.add(other.value));
    }

    public Money subtract(Money other) {
        BigDecimal result = this.value.subtract(other.value);
        if (result.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Resulting money cannot be negative");
        }
        return new Money(result);
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Money))
            return false;
        Money that = (Money) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
