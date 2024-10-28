### Objective:
Ths package contains a partial code for a web search engine. 
It will read a data file and "pretend" that each line is a query someone sent to a search engine. 
Our goal is to extract, on the fly, "interesting" queries meeting certain conditions.

Note that the code already uses the Observer Pattern to notify the Snooper of each query. 
The Snooper then prints everything out.

Change the code so that it uses the Strategy Design Pattern as follows:

- In the model, create a new interface which describes the interface for a policy object that will define a query filter.
- A query filter policy object will have one method which will be passed a string (the query)
and return true if the model should notify the observer about this query; 
returns false if the observer is not interested in this string (the query). 
For inspiration, see the Java FileFilter class.
- Change the model so when an observer is registered, the registration method to also accept a query filter policy object.
- Change the model to, for each query (string from the file), check if an observer is interested in the query before notifying it.
- Change the client (Snooper.java) to create two query observers:
- One prints out "Oh yes! <query>" whenever the query contains the word 'friend' (case insensitive).
- One prints out "So long....! <query>" whenever the query is more than 60 characters long.

- ### Sample output
```
Oh Yes!     Friends to this ground.
So long....     Enter KING CLAUDIUS, QUEEN GERTRUDE, HAMLET, POLONIUS, LAERTES, VOLTIMAND, CORNELIUS, Lords, and Attendants
Oh Yes!     And let thine eye look like a friend on Denmark.
Oh Yes!     Sir, my good friend; I'll change that name with you:
Oh Yes!     Those friends thou hast, and their adoption tried,
So long....     Or 'If we list to speak,' or 'There be, an if they might,'
Oh Yes!     May do, to express his love and friending to you,
Oh Yes!     As thus, 'I know his father and his friends,
So long....     That's not my meaning: but breathe his faults so quaintly
So long....     As 'twere a thing a little soil'd i' the working, Mark you,
Oh Yes!     'Good sir,' or so, or 'friend,' or 'gentleman,'
Oh Yes!     At 'closes in the consequence,' at 'friend or so,'
Oh Yes!     My excellent good friends! How dost thou,
So long....     Guildenstern? Ah, Rosencrantz! Good lads, how do ye both?
Oh Yes!     my good friends, deserved at the hands of fortune,
So long....     substance of the ambitious is merely the shadow of a dream.
Oh Yes!     beaten way of friendship, what make you at Elsinore?
Oh Yes!     thank you: and sure, dear friends, my thanks are
So long....     Why did you laugh then, when I said 'man delights not me'?
So long....     love, remember: and there is pansies. that's for thoughts.
Oh Yes!     Make choice of whom your wisest friends you will.
Oh Yes!     And you must put me in your heart for friend,
So long....     that is not guilty of his own death shortens not his own life.
So long....     such-a-one's horse, when he meant to beg it; might it not?
```

### Constraints
The model should not know anything about the implementation of the query filter policy objects, 
other than they implement the required interface.

