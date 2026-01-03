# Payment States

This folder contains the **state markers** for the Payment entity.

Each class implements the sealed interface `PaymentState`:

- **Pending** – Payment has been initiated but not yet authorized.
- **Authorized** – Payment has been approved but not captured.
- **Captured** – Funds have been successfully transferred.
- **Refunded** – Funds have been returned to the customer.
- **Failed** – Payment did not succeed.

These are **compile-time tokens only**. They contain no fields, methods, or logic.  
The compiler guarantees that only allowed payment states exist.
