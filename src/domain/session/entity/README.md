# Session Entity

This folder contains the **Session entity typed by state**.

## Purpose

The `Session<S extends SessionState>` entity represents a user session.  
Its **state is captured in the generic type parameter `S`**, ensuring compile-time enforcement of session validity.

## Rules

- No setters → immutable.
- No runtime state field → state is in the type parameter.
- Private constructor → creation via static factory.
- No transitions or behavior yet → only shaping type space.

## Fields

- `UserId userId` → the user owning this session.

## Factory Method

- `Session.of(UserId userId)` → creates a new typed session.
