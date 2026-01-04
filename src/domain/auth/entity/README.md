# User Entity

This folder contains the **User entity typed by authentication state**.

## Purpose

The `User<S extends AuthenticationState>` entity represents a user in the system.  
Its **authentication state is captured in the generic type parameter `S`**, enforcing compile-time guarantees.

## Rules

- No setters → immutable.
- No runtime state field → state is in the type parameter.
- Private constructor → creation via static factory.
- No transitions or behavior yet → only shaping type space.

## Fields

- `UserId id` → unique identifier for the user.
- `Email email` → validated email of the user.

## Factory Method

- `User.create(UserId id, Email email)` → creates a new typed user.
