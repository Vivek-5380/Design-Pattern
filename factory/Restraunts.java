package factory;

/**
 * Abstract class representing different restaurants that can create and prepare burgers.
 * This class implements the Factory Method pattern where concrete restaurants
 * will define their specific burger creation process.
 *
 * The class provides a template method {@code orderBurger()} that defines the algorithm
 * for ordering a burger, while delegating the actual burger creation to subclasses.
 */
public abstract class Restraunts {
    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();

        return burger;
    }

    public abstract Burger createBurger();
}
