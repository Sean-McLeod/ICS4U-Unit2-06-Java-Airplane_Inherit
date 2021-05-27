/*
* This is a program
* that tests various airplanes.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-26
*/

public final class FlyTest {
    private FlyTest() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /** This is the speed for bigPlane. */
    private static final int BIGPLANESPEED = 212;
    /** This is the speed for boeing. */
    private static final int BOEINGSPEED = 422;
    /** This represents how many number of
    times speed is going to be printed. */
    private static final int PRINTNUMBER = 4;
    /** This is the limit for boeing's speed . */
    private static final int SPEEDLIMIT = 5000;

    /**
    * This function
    * is the main function.
    * @param args
    */
    public static void main(final String[] args) {
        Airplane bigPlane = new Airplane();
        bigPlane.setSpeed(BIGPLANESPEED);
        System.out.println(bigPlane.getSpeed());
        Jet boeing = new Jet();
        boeing.setSpeed(BOEINGSPEED);
        System.out.println(boeing.getSpeed());
        int counter = 0;
        while (counter < PRINTNUMBER) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > SPEEDLIMIT) {
                bigPlane.setSpeed(bigPlane.getSpeed() * 2);
            } else {
                boeing.accelerate();
            }
            counter++;
        }
        System.out.println(bigPlane.getSpeed());
    }
}
