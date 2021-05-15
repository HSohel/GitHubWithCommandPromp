package practice;

public class LearnSwitchStatement {

    public void switchStatement(){
        char grade='A';
        switch(grade){

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Well done");
                break;
            case 'C':
                System.out.println("you Passed");
                break;
            case 'D':
                System.out.println("you  Failed");
            default:
                System.out.println("Invalid Grade");
        }

        System.out.println("The grade is "+grade);
    }
}
