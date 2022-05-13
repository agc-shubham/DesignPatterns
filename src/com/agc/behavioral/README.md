# Behavioral Design Patterns

### Memento: 
> Allows restoring an object to a previous state.

![Momento Image](./resources/momento.png)

The memento class is the one holding the different states you are dealing with in your object - it is what enables the "undo/redo" functionality.

What problems can the Memento design pattern solve?

 * The internal state of an object should be saved externally so that the object can be restored to this state later.
 * The object's encapsulation must not be violated.

The problem is that a well designed object is encapsulated so that its representation (data structure) is hidden inside the object and can't be accessed from outside the object.

What solution does the Memento design pattern describe?

Make an object (originator) itself responsible for

 * saving its internal state to a (memento) object and
 * restoring to a previous state from a (memento) object.

Only the originator that created a memento is allowed to access it.

A client (caretaker) can request a memento from the originator (to save the internal state of the originator) and pass a memento back to the originator (to restore to a previous state).

This enables to save and restore the internal state of an originator without violating its encapsulation.

### State: 
> Allows an object to behave differently depending on the state it is in.

### Iterator: 
> Allows iterating over an object without having to expose the object’s internal structure (which may change in the future).

### Strategy: 
> Allows passing different algorithms (behaviours) to an object. Allows defining a template (skeleton) for an operation. Specific 
> steps will then be implemented in subclasses.

### Command: 
> Allows decouple a sender from a receiver. The sender will talk to the receive through a command. Commands can be undone and 
> persisted.

### Observer: 
> Allows an object notify other objects when its state changes.

### Mediator: 
> Allows an object to encapsulate the communication between other objects.

### Chain of Responsibility: 
> Allows building a chain of objects to process a request.

### Visitor: 
> Allows adding new operations to an object structure without modifying it.