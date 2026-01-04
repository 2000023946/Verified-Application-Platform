# Payment Entity

This folder contains the **Payment entity typed by state**.

## Purpose

The `Payment<S extends PaymentState>` entity represents a payment.  
The **state is captured in the generic type parameter `S`**, enforcing compile-time correctness.

## Rules

- No setters → immutable.
- No runtime state field → state is in the type parameter.
- Private constructor → creation via static factory.
- No transitions or behavior yet → only shaping type space.

## Fields

- `Money amount` → amount of the payment.

## Factory Method

- `Payment.of(Money amount)` → creates a new typed payment.
