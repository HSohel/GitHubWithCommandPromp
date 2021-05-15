package javareview;

import java.util.Scanner;

public class ReadDataThroughTerminal {
    public void getInputFromUser(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter name here :");
        String s=Sc.nextLine();
        System.out.println("Name entered is :"+s);

        System.out.println("Enter age here :");
        int i=Sc.nextInt();
        System.out.println("Entered age is :"+i);
    }
}
