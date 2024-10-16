## Implement a Candy Store App Using the Factory Method Pattern

### Objective:
Develop a candy store application that utilizes the Factory Method design pattern to create different types of candies. 

The Factory Method should encapsulate the object creation process, 
allowing the app to dynamically decide which specific candy subclass to instantiate based on user input. 

This ensures that the candy classes themselves remain immutable, promoting cleaner, 
more maintainable code by centralizing the object creation logic in the factory.

## Requirements:

Candy Hierarchy:
- Define a family of candy types (e.g., Chocolate, Gummy, Lollipop), each represented by its own immutable class.

Factory Method:
- Implement a factory method to handle the creation of candy objects.
- Ensure the creation logic is centralized in the factory, so that no external class directly instantiates the candy objects.

## Extensibility:
The factory should be designed to allow the addition of new candy types without needing to modify existing code.
The solution should follow the Open/Closed Principle, allowing for the introduction of new candy subclasses 
while keeping the factory and candy hierarchy code stable.

## Test Cases:
- Test that the correct candy object is returned based on the input provided to the factory.
- Verify that the candy objects remain immutable once created.
- Ensure that adding a new candy type only requires changes in the factory logic and does not impact other parts of the application.
