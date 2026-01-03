# Ubiquitous Language for Verified Application Platform

## 1. Orders & Transactions

### Order
- A request by a customer to purchase one or more items.  
- Contains line items, pricing, quantities, and a current status.  
- Represents a business-level agreement, not just a database record.  

### Line Item
- A single product in an order with a specific quantity and price.  

### Order Status
The current stage of an order:
- **Created**  
- **Paid**: Indicates that funds have successfully transferred to the system. Payment is complete; no further authorization is needed.  
- **Authorized**: Payment has been approved but funds are not yet captured. Amount is reserved on the user’s payment method.  
- **Captured**: Authorized funds have been transferred to the merchant. Usually occurs before shipping items.  
- **Refunded**: Captured funds have been returned to the customer. Can be full or partial.  
- **Cancelled**: The order is terminated before completion. May occur before payment or after payment with a refund.  

---

## 2. Users & Identity

### Authenticated User
- A user whose identity has been verified by the system.  
- Can be tied to actions and transactions reliably.  

### Guest User
- A user interacting without authentication.  
- May create temporary orders or session-based data.  

### Customer
- A user who places orders.  
- May have multiple orders and payment methods.  

### Admin / Operator
- A user with elevated privileges to manage orders, products, and system configuration.  

### User Credential
- Information that proves identity (password, token, multi-factor authentication).  

### Session
- Temporary interaction of a user with the system.  
- Stores authentication state, shopping cart, and ephemeral data.  

---

## 3. Products & Inventory

### Product
- A sellable item defined by SKU, price, description, and availability.  

### SKU (Stock Keeping Unit)
- Unique identifier for a product.  

### Inventory
- Tracks the available quantity of each product.  
- Changes when orders are placed, stock is added, or items are returned.  

### Product Category
- Grouping of products by type or purpose for easier navigation and management.  

---

## 4. Payments & Financials

### Payment Method
- A mechanism to pay (credit card, bank transfer, token, wallet).  

### Authenticated Payment
- A payment verified for validity, sufficient funds, and ownership.  

### Transaction
- An attempt to move money from a user to the system.  
- Has multiple states: pending, authorized, captured, refunded, failed.  

### Payment Status
- **Pending**: Transaction is initiated but not completed.  
- **Failed**: Payment did not succeed.  
- **Authorized**: Funds approved but not captured.  
- **Captured**: Funds successfully transferred.  
- **Refunded**: Funds returned to customer.  

### Invoice
- A document summarizing payment request for an order.  
- Contains order details, payment status, and totals.  

---

## 5. Business Logic Concepts

### Requirement
- A compile-time invariant ensuring system correctness.  
- Cannot be violated; enforced by the type system rather than runtime tests.  

### Event
- Significant action in the system (order created, payment captured).  
- Triggers business processes, logging, or notifications.  

### Command
- A request to perform an action that changes system state.  
- Represents an intent, e.g., “CreateOrder” or “CapturePayment.”  

### Aggregate
- A cluster of related objects treated as a single unit for consistency.  
- Ensures that business rules are enforced across the cluster.  

### Value Object
- An immutable object defined by its properties, not identity.  
- Examples: Money, Address, Email.  

### Entity
- An object with a unique identity and lifecycle.  
- Examples: Order, User, Product.  

### Domain Service
- Encapsulates domain logic that doesn’t naturally belong to an entity or value object.  
- Example: Payment processing or authorization service.  

### Factory
- Creates complex objects with proper invariants.  
- Ensures entities are valid at creation.  

### Repository
- Provides access to aggregates while hiding storage details.  
- Ensures domain rules are respected when retrieving or saving.  

---

## 6. Security & Verification

### Authenticated Action
- Any action performed by a verified user.  
- Guarantees accountability and traceability.  

### Authorization
- Permission to perform an action based on roles or privileges.  

### Proof
- Cryptographic or logical evidence that a requirement has been satisfied.  

### Audit Log
- Immutable record of system actions.  
- Used for compliance, debugging, and verification.  

---

## 7. System & Operational Concepts

### Session
- Temporary interaction context of a user with the system.  
- Can hold authentication state, shopping cart, or other ephemeral data.  

### Notification
- Message sent to users or operators about system events (order shipped, payment failed).  

### Error / Exception
- Represents unexpected failure in system logic or infrastructure.  
- Must be captured and handled without violating invariants.  

### Configuration
- System-level settings controlling behavior, thresholds, or integrations.  

### Adapter
- Component translating external systems or protocols into domain concepts.  
- Example: Payment gateway adapter, email service adapter.  

### Port
- Interface exposing a domain service to the outside.  
- Allows decoupling of domain logic from external systems.  

### Delivery Mechanism
- How commands or events enter or exit the system.  
- Example: HTTP API, CLI, message queue.  
