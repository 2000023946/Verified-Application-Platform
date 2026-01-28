# Verified Application Platform - Workflow Overview

This diagram illustrates the **proof-driven domain model** used in the Verified Application Platform.  

The system enforces:

- **Domain-level step order:** Each domain entity requires the proof of the previous step before the next step can happen.
- **Use Case workflow completion:** The Use Case must complete all steps to produce a **UseCaseCompletedDTO**, ensuring no partial execution.
- **Persistence safety:** Repositories require the corresponding proofs to save or update entities.
- **Immutable Value Objects:** All Value Objects (`Money`, `Email`, `OrderId`, `UserId`) are immutable, preventing tampering.

---

## Workflow Diagram

```mermaid
flowchart TD
    %% Domain Entities
    PaymentPending -->|Authorize Payment| PaymentAuthorized
    PaymentAuthorized -->|Capture Payment + PaymentProof| PaymentCaptured
    PaymentCaptured -->|Generate PaymentCompletedProof| PaymentCompletedProof
    OrderDraft -->|Pay Order using PaymentCompletedProof| OrderPaid
    OrderPaid -->|Fulfill Order using FulfillmentProof| OrderFulfilled

    %% Use Case
    UC[Use Case: PayOrderUseCase] -->|Calls domain steps in order| PaymentPending
    UC -->|Receives final proof from last step| PaymentCompletedProof
    UC -->|Creates UseCaseCompletedDTO| DTO[PayOrderUseCaseCompletedDTO]

    %% Repository
    OrderRepo[OrderRepository] -->|Save requires OrderPaid + PaymentCompletedProof| DTO
    PaymentRepo[PaymentRepository] -->|Update requires PaymentCaptured + CapturedPaymentProof| DTO

    %% Flow connections
    PaymentCompletedProof --> OrderDraft
    OrderPaid --> OrderRepo
    DTO --> Controller[Controller receives DTO]

    %% Styling
    classDef domain fill:#f9f,stroke:#333,stroke-width:1px;
    classDef usecase fill:#bbf,stroke:#333,stroke-width:1px;
    classDef repo fill:#bfb,stroke:#333,stroke-width:1px;
    classDef dto fill:#ffb,stroke:#333,stroke-width:1px;

    class PaymentPending,PaymentAuthorized,PaymentCaptured,PaymentCompletedProof,OrderDraft,OrderPaid,OrderFulfilled domain;
    class UC usecase;
    class OrderRepo,PaymentRepo repo;
    class DTO dto;
