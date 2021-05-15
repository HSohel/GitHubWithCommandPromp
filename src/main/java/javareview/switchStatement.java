package javareview;

public class switchStatement {

    public void LearnSwitchStatement(){

        char grade ='A';
        switch (grade){

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Better");
                break;
            case 'C':
                System.out.println("Pass");
                break;
            case 'd':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid Grade");
        }

        System.out.println("Your grade is "+grade);

    }
}
