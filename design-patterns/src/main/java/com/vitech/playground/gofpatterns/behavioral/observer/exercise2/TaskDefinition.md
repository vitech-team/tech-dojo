### Objective:
This package contains a partial code for making some parts of a telephone.

Change the code so that it uses the Observer Design Pattern as follows:

- In the model, define an interface for the observers.
- Have the model notify the observers whenever a new digit is entered for the phone number.
- Have the UI (the Screen class) create two observers:
- The first observer prints the newest digit out to the screen
- The second observer prints "Now dialing 12345678901..." out to the screen (where the number is the number the model has).

### Sample output
```
Pressing: 2
2
Pressing: 5
5
Pressing: 5
5
Pressing: 4
4
Pressing: 8
8
Pressing: 1
1
Pressing: 7
7
Pressing: 0
0
Pressing: 9
9
Pressing: 2
2
Now dialing 2554817092...
```

### Constraints
- Only the UI(the Screen class)) can print to the screen
- The model must be decoupled from the UI (model must not know about the UI).