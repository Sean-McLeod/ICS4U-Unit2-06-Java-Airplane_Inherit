/*
* This is a super class
* that is about airplanes.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-26
*/

public class Airplane {
    /** This is the airplane's speed. */
    private int speed;

    /** This method is the constructor. */
    public Airplane() {
        speed = 0;
    }

    /**
    * This method gets
    * the value of speed.
    * @return speed
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * This method sets
    * the speed to userSpeed.
    * @param userSpeed
    */
    public void setSpeed(final int userSpeed) {
        this.speed = userSpeed;
    }
}
