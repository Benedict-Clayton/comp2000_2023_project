# Task 1
Behavioural pattern - Options: *Strategy* or *Observer* pattern.
You chose: Observer Pattern.

## Itemise changes made (which class files were modified)

1. Added Subject.java and Observer.java
- The Subject maintains the Observers, and the Observer defines what wants to be updated when called.
- We made this to implement the Observer Pattern.

2. Storage.java
- We made Storage be implement the Subject (as its the Subject being Observed by the players).
- We initialised an ArrayList of 'observers' that take in 'Observer'. We need a list to store our wonderful players after all!
- registerObserver, removeObserver and notifyObserver was added, as ways for Observers to be registered, removed AND notified! Awesome.
- Finally we used the notifyObserver() in the store and retrieve so that when an item is stored or retrieved, it notifies the Players.

3. Player.java
- Made the Player implement the Observer.
- After that, we just implemented the update method from the Observer interface. Nice!

4. App.java
- Of course, wall of this is pointless if the Player isn't an Observer. That's why we put a 'storage.registerObserver(player);' up in there.


# Task 2
Structural pattern - *Composite* pattern.

## Itemise changes made (which class files were modified)

1. 






Composite fun:

What needs to happen?

When an item is crafted, the items should be sourced from the players inventory.


// No need to do this because bugs. Yay!
When an item is pulled apart/uncrafted, the items should be returned to the players inventory.





# Task 3

## Itemised changes or new files
1. 

## What was changed
1. 

## Why it was changed
1. 

## The benefits of the change
1. 