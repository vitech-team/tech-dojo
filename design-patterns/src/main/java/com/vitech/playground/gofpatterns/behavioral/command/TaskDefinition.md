## Implement Elevator Door Control Using the Command Pattern

### Objective:

Create a program that simulates an elevator control system with two buttons:
one to open the door and one to close it.

The program should implement the Command design pattern to decouple the button presses from the actual logic
that opens and closes the elevator door.
This will allow the buttons to trigger door operations without the buttons needing to know the details of how the door
functions.

The Command pattern will also enable flexibility in future expansions, such as adding more commands or changing button
functionality without altering the core logic.

### Requirements:

#### Button Commands:

Each button (open and close) should have its own command class implementing a common interface.
The command objects will encapsulate the actions of opening and closing the elevator door.
There should be a clear separation between the button and the functionality it triggers, following the Command pattern's
principles.

#### Command Pattern Structure:

Use the Command design pattern to decouple the button actions from the door operations.
The buttons should invoke commands, but they should not directly control the door's behavior.
The command objects will delegate the door-opening and door-closing actions to the Elevator class.

#### Button Class:

Implement a button class for each button (Open and Close) that triggers the corresponding command.
The button class should execute the associated command when pressed.

#### Test Cases:

Test that the door opens when the open button is pressed and closes when the close button is pressed.
Ensure that the program can handle multiple consecutive button presses, such as pressing "open" multiple times or
pressing "close" when the door is already closed.