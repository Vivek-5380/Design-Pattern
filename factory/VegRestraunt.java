package factory;

/**
 * Represents a vegetarian restaurant that specializes in creating vegetarian burgers.
 * This class extends the Restraunts abstract class and implements the factory method pattern.
 * 
 * @see Restraunts
 * @see VegBurger
 */
public class VegRestraunt extends Restraunts {
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }
}
