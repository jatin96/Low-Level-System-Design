# Prototype Pattern

Simple way of creating objects using clonables.
# Problems it solves
- Creating copies of objects is hard. First create a new object then copy all the fields of old object into the new one. Phew!
- Sometimes the fields might be private so object creation is not easy
- 
# When to use
- Creating large number of objects of same or different types.
- Used when creating objects of a type is hard.
- Your code should not depend on the concrete classes of objects you copy.

# How to implement
- Create a clonable interface.
- Create a prototype.
- Add to registry.
- Create more objects using registry.