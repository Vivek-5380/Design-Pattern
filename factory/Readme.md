# Factory Method Design Pattern Example: Restaurants and Burgers

## Introduction

This project demonstrates the use of the **Factory Method** design pattern through a simple restaurant example. Different types of restaurants produce specific types of burgers without exposing the creation logic to the client. This approach promotes loose coupling and adheres to object-oriented design principles.

## Design Pattern Overview

The **Factory Method** design pattern:

* Defines an interface for creating an object but lets subclasses decide which class to instantiate.
* Allows a class to defer instantiation to subclasses.
* Promotes flexibility and scalability by decoupling object creation from its usage.

## Participants in This Example

* **Product Interface (`Burger`)** : Defines the interface for burger objects.
* **Concrete Products** : `VegBurger`, `NonvegBurger` implement the `Burger` interface.
* **Creator Abstract Class (`Restraunts`)** : Declares the factory method `createBurger()`.
* Provides a method [orderBurger()](vscode-file://vscode-app/c:/Users/HP/AppData/Local/Programs/Microsoft%20VS%20Code/resources/app/out/vs/code/electron-sandbox/workbench/workbench.html) which calls the factory method.
* **Concrete Creators** :
* `VegRestraunt`: Overrides `createBurger()` to return a `VegBurger`.
* `NonvegRestarunt`: Overrides `createBurger()` to return a `NonvegBurger`.

## How It Works

1. **Abstract Creator (`Restraunts`)** defines an abstract method `createBurger()`.
2. **Concrete Creators** (`VegRestraunt`, `NonvegRestarunt`) implement `createBurger()` to instantiate specific burger types.
3. **Client Code** interacts with the `Restraunts` class and calls [orderBurger()](vscode-file://vscode-app/c:/Users/HP/AppData/Local/Programs/Microsoft%20VS%20Code/resources/app/out/vs/code/electron-sandbox/workbench/workbench.html).
4. The [orderBurger()](vscode-file://vscode-app/c:/Users/HP/AppData/Local/Programs/Microsoft%20VS%20Code/resources/app/out/vs/code/electron-sandbox/workbench/workbench.html) method uses the factory method `createBurger()` to get a burger and perform operations on it without knowing its concrete class.

## Benefits

* **Encapsulation** : Hides the instantiation logic from the client.
* **Flexibility** : Easy to introduce new types of products without changing existing code.
* **Single Responsibility Principle** : Separates the product creation code from the product usage code.

## Real-World Analogy

Just like a customer ordering a burger from a restaurant without knowing how it's made, the client orders a burger from `Restraunts` without knowing the instantiation details. Different restaurants know how to make their specific burgers.

## Conclusion

This example effectively demonstrates the Factory Method design pattern by decoupling the creation of burger objects from their usage, allowing for flexibility and adherence to solid design principles.
