package com.vitech.playground.gofpatterns.behavioral.command;

import com.vitech.playground.gofpatterns.behavioral.command.model.Button;
import com.vitech.playground.gofpatterns.behavioral.command.model.Close;
import com.vitech.playground.gofpatterns.behavioral.command.model.Elevator;
import com.vitech.playground.gofpatterns.behavioral.command.model.Open;

public class CommandApp {

    public static void main(String[] args) {

        // Create a program that simulates an elevator control system with two buttons:
        // one to open the door and one to close it.
        //
        //The program should implement the Command design pattern to decouple the button presses from the actual logic
        //that opens and closes the elevator door.

        Elevator elevator = new Elevator();

        Button open = new Open(elevator);
        Button close = new Close(elevator);

        open.push();
        open.push();

        close.push();
        close.push();

    }
}
