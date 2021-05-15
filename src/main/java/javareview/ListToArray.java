package javareview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public void learnListToArray(){
        List<String> stateList=new ArrayList<>();
        stateList.add("one");
        stateList.add("two");
        stateList.add("three");
        stateList.add("four");
        stateList.add("five");

        String [] arrayState=stateList.toArray(new String[stateList.size()]);
        System.out.println(Arrays.toString(arrayState));





    }
}
