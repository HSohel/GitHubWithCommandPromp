package practice;


public class Variable {

    Character grade='A';

    public void intVariables(){
        int salary=1800;
        System.out.println("My salary is :"+ salary);
    }

    public void floatVariables (){
        float price=45.5f;
        System.out.println(price);
    }

    public void booleanVariables(){
        boolean green=true;
        boolean red=false;
        System.out.println("Green color is "+ green +"& Red color is "+red);
    }

    public void charVariable(){
        System.out.println("My grade is "+grade);
    }

    public void stringVariable(){
        String name="Adam";
        String state="PA";
        System.out.println("My name is "+name+" and i live in "+state);
    }

    public int addNumber(int a, int b){
        int sum=a+b;
        return sum;
    }
}
