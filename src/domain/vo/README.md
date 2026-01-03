# Value Objects (VOs)

This folder contains **immutable domain Value Objects** for the system.  
Value Objects are used to **represent concepts with validation and invariants**.  
They are **final, immutable, and validated at creation**.  

## List of Value Objects

### 1. OrderId
- Wraps a UUID representing an order identifier.
- Ensures non-null and valid format.
- Factory methods: `of(UUID)`, `random()`.

### 2. UserId
- Wraps a UUID representing a user identifier.
- Ensures non-null and valid format.
- Factory methods: `of(UUID)`, `random()`.

### 3. Money
- Wraps a `BigDecimal` representing monetary values.
- Cannot be negative.
- Factory methods: `of(BigDecimal)`, `of(double)`.
- Operations: `add`, `subtract` (always validated).

### 4. Email
- Wraps a string representing a valid email address.
- Validates email format at creation.
- Factory method: `of(String)`.

## Rules for All Value Objects

- **Final classes** → cannot be extended.
- **Private constructors** → can only be created via static factory methods.
- **Validation on construction** → invalid values rejected immediately.
- **No getters exposing primitives unnecessarily** → only safe operations or toString.
- **Immutable** → once created, state cannot change.

These Value Objects enforce **domain invariants at compile-time and construction time**, reducing runtime errors and invalid data.
