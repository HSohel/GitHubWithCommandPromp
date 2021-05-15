package final_practice;

public class BiCycle {
    int gear;
    int speed;

    public BiCycle(int gear, int speed){
        this.gear=gear;
        this.speed=speed;
    }


    public void speedUp(int increaseSpeed){
        speed+=increaseSpeed;

    }

    public void breakDown(int breakDown){
        speed-=breakDown;
    }

    public String toString(){
        return ("Number of gear is :"+gear + ": speed is "+speed);
    }


}
