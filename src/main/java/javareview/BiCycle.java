package javareview;

public class BiCycle {

    int speed;
    int gear;

    public BiCycle(int speed, int gear){
        this.speed=speed;
        this.gear=gear;
    }

    public void applyBreak(int increment){
        speed-=increment;
    }

    public void speedUp(int decrement){
        speed+=decrement;
    }

    public String printData(){
        return ("speed is :"+speed+" and no of gear is "+gear);
    }

}
