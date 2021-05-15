package practice;

public class ExceptionHandling {
    public void ReadValueFromArray(){
        try{
            int [] numbers={1,2,3,4};
            System.out.println(numbers[5]);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public void AddNumbers(){
        int sum=5+5;
        System.out.println(sum);
    }

    public void SubtractNumbers(){
        int result=10-5;
        System.out.println(result);
    }
}
