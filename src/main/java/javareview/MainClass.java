package javareview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;

public class MainClass {


    public static void main(String[] args) throws ParseException {


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now=LocalDateTime.now();
        //Date date=new Date();
        System.out.println(dtf.format(now));

        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date d=sdf.parse("03/12/2021");
        sdf.applyPattern("MM-dd-yyyy");
        System.out.println(sdf.format(d));



        Date date1=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(s.format(date1));


        Date date2=java.util.Calendar.getInstance().getTime();
        System.out.println(date2);

        HashMap<String,Integer> hMap=new HashMap<>();




    }
}