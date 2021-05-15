package practice;

public class Bicycle {
    int gear;
    int speed;

    public Bicycle(int gear, int speed){
        this.gear=gear;
        this.speed=speed;
    }

    public void incrementSpeed(int increment){
        speed+=increment;
        System.out.println("speed after increment "+speed);
    }

    public void decrementSpeed(int decrement){
        speed-=decrement;
        System.out.println("speed after decrement "+speed);

    }


    public String printValue(){
        return ("Gear of Bicycle is "+gear+" and speed of BiCycle is "+speed);
    }
}
