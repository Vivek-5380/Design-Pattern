package factory;

/**
 * The Main class serves as the entry point for the application.
 * It demonstrates the Factory Design Pattern by creating instances
 * of vegetarian and non-vegetarian restaurants and ordering burgers from them.
 */
public class Main {
    public static void main(String args[]) {
        Restraunts nonvegRestarunt = new NonvegRestarunt();
        nonvegRestarunt.orderBurger(); // Outputs: Preparing Non-Veg Burger

        Restraunts vegRestraunt = new VegRestraunt();
        vegRestraunt.orderBurger(); // Outputs: Preparing Veg Burger
    }
}
