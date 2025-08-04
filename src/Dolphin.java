public class Dolphin extends Animal implements Swim {
    /**
     * TODO 2: extend the class Animal to create a new
     * water based animal named "Dolphin" which
     * extends Animal
     * Extra properties of class "Dolphin" include:
     * 1. color of dolphin
     * 2. swimming speed
     **/
    //attributes
    String colorOfDolphin;
    int dolphinSpeed;

    //constructor
    public Dolphin() {
        this.dolphinSpeed = dolphinSpeed;
    }

    //getter for dolphin speed
    public int getDolphinSpeed(){
        return dolphinSpeed;
    }

    //setter for dolphin speed
    public void setDolphinSpeed(int dolphinSpeed){
        this.dolphinSpeed = dolphinSpeed;
    }

    //getter for color
    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    //setter for color
    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    /** TODO 3: implement the unimplemented methods of
     *           "Eat" interface in the class
     *          "Tiger" class created in the TODO 1
     *          and also in the
     *          "Dolphin" class created in TODO 2.
     **/
    @Override
    public void eatingFood(){
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted () {
        System.out.println("I have eaten fish");
    }

    /** TODO 7: implement the "Swim" interface
     *          in the "Dolphin" class and the
     *          "swimming" method in its implementation
     *          should display the swimming speed as
     *          "Dolphin: I am swimming at the speed ...."
     *          where .... is the value of the variable
     *          "swimmingSpeed"
     **/
    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + dolphinSpeed + "nautical miles per hour");
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("Speed: " + getDolphinSpeed() + " nmph");
        super.displayCharacteristics();
        System.out.println("Color of dolphin: " + getColorOfDolphin());
    }
}

