package practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LearnReadValueFromTerminal {

    public void getInputFromUser(){
        LearnHashMap objHashMap=new LearnHashMap();
        Scanner Scan=new Scanner(System.in);
        /*System.out.println("Enter String here :");
        String str=Scan.nextLine();
        System.out.println("You have entered "+str);

        System.out.println("Enter your age :");
        int age=Scan.nextInt();
        System.out.println("You entered age"+age);

        System.out.println("Enter the price :");
        float price=Scan.nextFloat();
        System.out.println("The price is "+price);*/

        System.out.println("Enter key Name :");
        objHashMap.PrintHashmapValue(Scan.nextLine());

    }



}
