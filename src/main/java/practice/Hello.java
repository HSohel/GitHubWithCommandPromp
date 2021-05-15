package practice;

import polimorphism.*;
import polimorphism.Parent;

import java.util.Arrays;

public class Hello {


    public static void main(String[] args){

        /*Variable Objvar=new Variable();
        Objvar.intVariables();
        Objvar.floatVariables();
        Objvar.booleanVariables();
        Objvar.stringVariable();
        Objvar.charVariable();
        int total=Objvar.addNumber(5, 5);
        System.out.println(total);*/

        //LoopControl objLoop=new LoopControl();
        //objLoop.whileLoop();
        //objLoop.forLoop();
        //objLoop.doWhileLoop();

        //LearnArray objArray=new LearnArray();
        //objArray.stringArray();
        //objArray.splitArray();

        //LearnList objList=new LearnList();
        //objList.printList();

        //ConverArraytoList objArrayToList=new ConverArraytoList();
        //objArrayToList.arraytoList();

        //ConvertListtoArray objListtoArray=new ConvertListtoArray();
        //objListtoArray.listtoArray();

        //LearnSwitchStatement objswitchstatement=new LearnSwitchStatement();
        //objswitchstatement.switchStatement();

        //ConditionalOPerators objConditionalOPerators=new ConditionalOPerators();
        //objConditionalOPerators.conditionaloperator(2);

        //StringMethods objStringMethods=new StringMethods();
        //objStringMethods.IndexOf();
        //objStringMethods.MethodSubString();

        //LearnHashMap objHashMap=new LearnHashMap();
        //objHashMap.AddHashMapValue();

        //LearnReadValueFromTerminal objTerminal=new LearnReadValueFromTerminal();
        //objTerminal.getInputFromUser();

        //MyClass objMyClass=new MyClass();
        //System.out.println(objMyClass.x);

        //ExceptionHandling objException=new ExceptionHandling();
        //objException.ReadValueFromArray();
        //objException.AddNumbers();
        //objException.SubtractNumbers();

        //LearnEnum objEnum=new LearnEnum();
        //objEnum.printEnum();

        //LearnThisKeyword objThis=new LearnThisKeyword();
        //objThis.setValue(3,2);
        //objThis.printValue();

        /*MotorCycle objMotorbike=new MotorCycle(2,8,5);
        String info=objMotorbike.printValue();
        System.out.println(info);
        objMotorbike.incrementSpeed(4);
        objMotorbike.decrementSpeed(5);
        objMotorbike.setSeatHeight(7);*/

        /*LearnOverloading objOverloading=new LearnOverloading();
        int a=objOverloading.sum(3,5);
        System.out.println(a);
        int b=objOverloading.sum(7,8,9);
        System.out.println(b);
        double c=objOverloading.sum(12.50,25.50,50.5);
        System.out.println(c); */

       /*Parent obj1= new Parent();
        obj1.show();

        Parent obj2=new Child();
        obj2.show();
        Child obj3=new Child();
        obj3.show(); */


       /* LearnEncaplsulation objEncapsulation=new LearnEncaplsulation();
        objEncapsulation.setName("Robert");
        objEncapsulation.setRoll("Automation Engineer");
        objEncapsulation.setAge(35);

        System.out.println(objEncapsulation.getName());
        System.out.println(objEncapsulation.getRoll());
        System.out.println(objEncapsulation.getAge()); */

        //pig objPig=new pig();
        //objPig.animalSound();
        //objPig.AnimalSleep();

        LearnArray objarray=new LearnArray();

        int[]d={1,2,3};
        int[]e={7,8,9};
        int []c=objarray.arrayFirstElement(d,e);
        System.out.print(Arrays.toString(c));







        }

    }



