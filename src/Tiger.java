public class Tiger extends Animal implements Walk {
    /** TODO 1: extend the class Animal to create a new
     * land based animal named "Tiger" which
     * extends Animal.
     * Extra properties of class "Tiger" are:
     * 1. number of stripes
     * 2. speed
     * 3. sound level of roar
     *
     **/
    //attributes
    int numberOfStripes;
    int tigerSpeed;
    int soundLevelOfRoar;

    //constructor
    public Tiger () {
        this.numberOfStripes = numberOfStripes;
        this.tigerSpeed = tigerSpeed;
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    //getter for tiger speed
    public int getTigerSpeed(){
        return tigerSpeed;
    }

    //setter for tiger speed
    public void setTigerSpeed(int tigerSpeed){
        this.tigerSpeed = tigerSpeed;
    }

    //getter for level of roar
    public int getLevelOfRoar(){
        return soundLevelOfRoar;
    }

    //setter for level of roar
    public void setLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    /** TODO 3: implement the unimplemented methods of
     *           "Eat" interface in the class
     *          "Tiger" class created in the TODO 1
     *          and also in the
     *          "Dolphin" class created in TODO 2.
     **/
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    /** TODO 5: implement the "Walk" interface in
     *          "Tiger" class created in the TODO 1
     *          and in the  implementation of the
     *          "walking" method of the interface
     *          display -
     *          "Tiger: I am walking at the speed "
     *          and join the value of the variable "speed"
     *
     **/
    @Override
    public void walking () {
        System.out.println("Tiger: I am walking at the speed of " + tigerSpeed + " mph");
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("Speed: " + getTigerSpeed());
        super.displayCharacteristics();
        System.out.println("Level of roar: " + getLevelOfRoar());
    }
}
