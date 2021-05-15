package final_practice;

public class MountainBike extends BiCycle {
    int seatHeight;
    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight=seatHeight;
    }


     public void setHeight(int newHeight){

        seatHeight+=newHeight;
     }

     public void myMessage(){
         System.out.println(this.getClass().getName());
     }

    public void getClassName()
    {
        String className = new Object() {}
                .getClass()
                .getEnclosingClass()
                .getName();

        System.out.println("Current Class is " + className);
    }


     public String toString(){
        return "No of gear :"+gear+" speed :"+speed +": Seat Height :"+seatHeight;
     }

}
