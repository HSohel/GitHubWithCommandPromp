package javareview;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    public void LearnArrayToList(){
        String [] stateArray={"New York", "New Jersey","Pennsylvania","Maryland"};
        List<String> lists=new ArrayList<>();
        for (String a:stateArray){
            System.out.println(lists.add(a));
        }
        System.out.println(lists);
    }
}
