# Order Entity

This folder contains the **Order entity typed by state**.

## Purpose

The `Order<S extends OrderState>` entity represents a purchase order.  
Its **state is captured in the generic type parameter `S`**, ensuring compile-time enforcement of valid states.

## Rules

- No setters → immutable.
- No runtime state field → state is in the type parameter.
- Private constructor → creation is controlled via static factory.
- No transitions or behavior at this stage → shaping the type space.

## Fields

- `OrderId id` → unique identifier for the order.
- `Money total` → total value of the order.

## Factory Method

- `Order.create(OrderId id, Money total)` → creates a new typed order.
