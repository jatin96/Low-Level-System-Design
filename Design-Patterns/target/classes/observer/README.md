# Observer Design Pattern

- I have an object of interest.
- I want to be notified when something changes
- On change, I want to take an action

let's say you want to do something when the price of bitcoin changes
- your bitcoin price change method is observable (price field)
- observers are the things you want to do, like tweet, buy, email etc when the price of bitcoin change.

When to use ? 
- object of interest
- I want to take an action when the object of interest changes.

This pattern is extensively used in java.

# How to implement this ? 
- Create an interface for all observers with a common method  like takeAction();
- implement the interface with the concrete classes.
- Create an abstract class called Observable which has methods to register and deregister observers and method to notify all
- extend the abstract class in your tracker and use the method notify() to call observers.