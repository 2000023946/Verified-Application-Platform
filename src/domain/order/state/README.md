# Order States

This folder contains the **state markers** for the Order entity.

Each class implements the sealed interface `OrderState`:
- `Draft` – Order has been created but not paid.
- `Paid` – Payment has been completed.
- `Captured` – Authorized funds have been captured.
- `Fulfilled` – Items have been shipped or delivered.
- `Cancelled` – Order has been cancelled.

These are **compile-time tokens only**. They do not contain methods, fields, or behavior.
The compiler ensures that only valid states exist and prevents illegal state transitions.
