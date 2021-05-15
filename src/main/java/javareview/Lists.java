package javareview;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    List<String> lists=new ArrayList<>();
    public void AddValueToList(){
        lists.add("one");
        lists.add("two");
        lists.add("three");
        lists.add("four");
        lists.add("Five");

        //for (int x=0;x<=lists.size()-1;x++){
           // System.out.println(lists.get(x));
        //}


        System.out.println(lists.remove("Five"));
        if (lists.contains("Five")){
            System.out.println("Statement is False");
        } else {
            System.out.println("Statement is True");
        }
        for (String a:lists){
            System.out.println(a);
        }

    }
}
