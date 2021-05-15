package practice;

public class MotorCycle extends Bicycle{
    int seatHeight;

    public MotorCycle(int gear, int speed, int seatHeight ){
        super (gear,speed);
        this.seatHeight=seatHeight;

    }


    public void setSeatHeight(int newValue){
        seatHeight=newValue;
        System.out.println("New SeatHeight is "+seatHeight);
    }

    public String printValue(){
        return (super.printValue()+" SeatHeight is "+seatHeight);

    }

}
