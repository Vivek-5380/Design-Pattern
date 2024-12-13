package factory;

/**
 * A concrete factory class that specializes in creating non-vegetarian burgers.
 * This class extends the Restaurants abstract class and implements the factory method pattern.
 * It provides specific implementation for creating non-vegetarian burger objects.
 * 
 * @see Restraunts
 * @see NonvegBurger
 */
public class NonvegRestarunt extends Restraunts {
    @Override
    public Burger createBurger() {
        return new NonvegBurger();

    }
}