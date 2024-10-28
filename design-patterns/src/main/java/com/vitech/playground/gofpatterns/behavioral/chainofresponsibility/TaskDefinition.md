## Implement Salary Increase Request Processing Using the Chain of Responsibility Pattern

### Objective:
Implement the Chain of Responsibility design pattern to model the processing of an employee’s salary 
increase request based on the requested percentage.
The responsibility for approving the request should be delegated to different hierarchical roles 
within the company (Immediate Supervisor, Head of Unit, and CEO) depending on the size of the request. 

The solution should demonstrate how requests are passed along the chain until 
the appropriate handler approves or rejects them.

### Requirements:

#### Roles/Handlers:
The system must define the following roles (handlers) in the chain:

- Immediate Supervisor:
  - Can approve salary increase requests of up to 2%.
  - Forwards requests exceeding 2% to the next handler (Head of Unit).

- Head of Unit:
  - Can approve salary increase requests between 2% and 5%.
  - Forwards requests exceeding 5% to the next handler (CEO).

- CEO:
  - Can approve any salary increase requests exceeding 5%.

#### Request Class:
The request should contain:

- The employee's name.
- The current salary of the employee.
- The requested percentage increase.

#### Chain of Responsibility:

Each handler should check if the salary increase request is within their approval limits. 
If not, the request should be forwarded to the next handler in the chain.

If a request cannot be handled by any role, it should result in rejection or an appropriate response.

#### Approval/Processing Mechanism:
Each handler must:

- Log or print out whether the request was approved or passed to the next role.
- Display appropriate messages when a request is approved or forwarded to the next level.

### Example Scenario:

Create an employee request for a salary increase of 1.5%, which is handled by the Immediate Supervisor.
Create a request for a 3% increase, handled by the Head of Unit.
Create a request for a 6% increase, which reaches the CEO for approval.

Edge Cases:
Handle scenarios where the requested increase is invalid (e.g., negative values or values that are too high).
Ensure that requests without a defined handler (i.e., outside the responsibility chain) are appropriately rejected.