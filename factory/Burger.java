package factory;

public interface Burger {
    void prepare();
}

/**
 * A concrete implementation of the Burger interface representing a non-vegetarian burger.
 * This class provides specific preparation steps for making a non-vegetarian burger.
 * @see Burger
 */
class NonvegBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Non-Veg Burger");
    }
}

/**
 * A concrete implementation of the Burger interface representing a
 * vegetarian burger.
 * This class provides specific preparation steps for making a vegetarian burger.
 * @see Burger
 */
class VegBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Burger");
    }
}