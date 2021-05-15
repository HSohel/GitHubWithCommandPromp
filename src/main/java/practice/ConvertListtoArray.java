package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class ConvertListtoArray {

    public void listtoArray(){
        List<String>listfruits=new ArrayList<>();
        listfruits.add("Orange");
        listfruits.add("Mango");
        listfruits.add("Strawberry");
        listfruits.add("Blueberry");
        System.out.println(listfruits);

        String[] arrayFruits=listfruits.toArray(new String[listfruits.size()]);
        System.out.println(Arrays.toString(arrayFruits));

        }
    }


