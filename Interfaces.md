A normal interface in programming is a contract that defines what methods a class must implement, without specifying how they're implemented. Think of it as a blueprint or agreement.


Key characteristics:

1. Contains method signatures (names, parameters, return types) but no actual code
2. Classes that "implement" the interface must provide the actual method implementations
3. Enables polymorphism - different classes can implement the same interface in their own way
4. Provides a standard way for different objects to interact

Why use interfaces:

1. Flexibility - swap implementations without changing other code
2. Testability - create mock implementations for testing
3. Organization - separate what something does from how it does it
4. Multiple inheritance - a class can implement multiple interfaces


Interfaces are essentially a way to ensure different classes follow the same "rules" while allowing each to implement those rules in their own specific way.