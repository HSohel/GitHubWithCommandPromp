package final_practice;

import java.text.ParseException;
import java.util.Arrays;

public class Main {

    public static void main (String [] args) throws ParseException {

        MountainBike mountainBike=new MountainBike(2,5,8);
        //mountainBike.speedUp(4);
        mountainBike.breakDown(1);
        mountainBike.setHeight(2);
        System.out.println(mountainBike.toString());

        mountainBike.myMessage();
        mountainBike.getClassName();




    }
}
