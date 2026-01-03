# Session States

This folder contains the **state markers** for user sessions.

Each class implements the sealed interface `SessionState`:

- **Active** – Session is currently active and usable.
- **Expired** – Session has timed out and is no longer valid.
- **Terminated** – Session has been explicitly closed or revoked.

These are **compile-time tokens only**.  
They enforce session validity at the type level and prevent operations on invalid sessions.
