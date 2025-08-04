public class Penguin extends Animal implements Swim {
    //attributes
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    //constructor
    public Penguin () {
        this.swimSpeed = swimSpeed;
        this.walkSpeed = walkSpeed;
    }

    //getters
    public int getSwimSpeed(){
        return swimSpeed;
    }

    public int getWalkSpeed(){
        return walkSpeed;
    }

    public boolean getIsPenguinSwimming(){
        return isSwimming;
    }

    //setters
    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public void setIsPenguinSwimming(boolean isSwimming){
        this.isSwimming = isSwimming;
    }

    @Override
    public void eatingFood(){
        System.out.println("Penguin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted () {
        System.out.println("I have eaten fish");
    }

    @Override
    public void swimming() {
        if (getIsPenguinSwimming()) {
            System.out.println("Penguin: I am swimming at the speed of " + getSwimSpeed() + "nautical miles per hour");
        } else {
            System.out.println("Penguin: I am walking at the speed of " + getWalkSpeed() + "nautical miles per hour");
        }
    }

    @Override
    public void displayCharacteristics(){
        super.displayCharacteristics();
        if (getIsPenguinSwimming()) {
            System.out.println("Swimming speed: " + getSwimSpeed() + " nmph");
        } else {
        System.out.println("Walking speed: " + getWalkSpeed() + " nmph");
        }
    }
}
