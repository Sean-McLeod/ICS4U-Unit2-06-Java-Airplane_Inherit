/*
* This is a sub class
* that is about jets.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-26
*/

public class Jet extends Airplane {
    /** This is the multiplier for the speed. */
    private static final int MULTIPLIER = 2;

    /** This constructor is the
    child constructor of AirPlane. */
    public Jet() {
        super();
    }

    /**
    * This function
    * sets the speed of the Jet.
    * @param speed
    */
    public void setSpeed(final int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
    * This function
    * accelerates the speed.
    */
    public void accelerate() {
        super.setSpeed(super.getSpeed() * MULTIPLIER);
    }
}
