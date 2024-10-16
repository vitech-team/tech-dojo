package com.vitech.playground.gofpatterns.behavioral.observer.exercise1;

import com.vitech.playground.gofpatterns.behavioral.observer.exercise1.model.Connection;
import com.vitech.playground.gofpatterns.behavioral.observer.exercise1.model.StatusFeed;

public class ObserverApp {

    public static void main(String[] args) {
        // Implement a simple social media platform which notifies one's connections
        // when one updates their status, showing that update on their feed.
        //
        // Connection represents the connection with another user, with a status String field (observable)
        // StatusFeed represents your feed, with a statuses List of String field (observer)
        //
        // ObserverApp prints statuses of your connections

        Connection bob = new Connection();
        Connection emily = new Connection();
        StatusFeed feed = new StatusFeed();

        feed.printStatuses();

        emily.setStatus("Hi friends =) Going for a walk. Would anyone join?");
        bob.setStatus("Just finished my lunch. The burgers here are delicious.");

        feed.printStatuses();
    }
}
