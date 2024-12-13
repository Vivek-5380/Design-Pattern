package singelton;

/**
 * The Singelton class implements the Singleton design pattern.
 * This ensures that only one instance of the class is created and provides a global point of access to it.
 * The class uses double-checked locking to reduce the overhead of acquiring a lock by first checking the locking criterion without actually acquiring the lock.
 */
public class Singelton {

    /**
     * The volatile keyword ensures that multiple threads handle the instance variable correctly when it is being initialized to the Singelton instance.
     */
    private static volatile Singelton instance;

    /**
     * The data field stores the data associated with the singleton instance.
     */
    private String data;

    /**
     * Private constructor to prevent instantiation from other classes.
     * 
     * @param data The data to be associated with the singleton instance.
     */
    private Singelton(String data) {
        this.data = data;
    }

    /**
     * Returns the singleton instance of the Singelton class.
     * If the instance does not exist, it is created inside a synchronized block to ensure thread safety.
     * 
     * @param data The data to be associated with the singleton instance.
     * @return The singleton instance of the Singelton class.
     */
    public static Singelton getInstance(String data) {
        Singelton res = instance; // Use of local variable improves code performance

        if (res == null) {
            synchronized (Singelton.class) {
                res = instance;

                if (res == null) {
                    instance = res = new Singelton(data);
                }
            }
        }

        return res;
    }
}