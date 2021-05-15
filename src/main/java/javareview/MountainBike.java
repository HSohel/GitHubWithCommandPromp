package javareview;

public class MountainBike extends BiCycle {
   int seatHeight;

    public MountainBike(int speed, int gear, int seatHeight){
        super(speed, gear);
        this.seatHeight=seatHeight;

    }

    public void setSeatHeight(int newHeight){
        seatHeight=newHeight;
    }

    public String printData(){
        return(super.printData()+" and new seatHeight is "+seatHeight);
    }

}
