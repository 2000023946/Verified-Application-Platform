# Authentication States

This folder contains the **state markers** for user authentication.

Each class implements the sealed interface `AuthenticationState`:

- **Unauthenticated** – User has not logged in or verified identity.
- **Authenticated** – User has successfully logged in and identity is verified.

These are **compile-time tokens only**.  
They ensure that actions requiring authentication can only accept an `Authenticated` user.
