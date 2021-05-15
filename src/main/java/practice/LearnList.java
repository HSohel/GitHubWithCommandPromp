package practice;

import java.net.StandardSocketOptions;
import java.util.*;

public class LearnList {

    List<String> states=new ArrayList<String>();
    public void AddValuetoList(){
        states.add("New York");
        states.add("New Jersey");
        states.add("Pennsylvania");
        states.add("Delaware");
        states.add("Maryland");
    }

    public void addmorevaluetoList(){
        states.add("Virginia");
        states.add("North Carolina");
        states.add("South Carolina");

    }

    public void removevaluefromlist(){
        states.remove("New Jersey");
        states.remove("Pennsylvania");

    }


    public void printList() {
        AddValuetoList();
        for (String state : states) {
            System.out.println(states);
        }
        addmorevaluetoList();
        for (String state : states) {
            System.out.println(state);
        }

        removevaluefromlist();
        for (int i=0;i<=states.size();i++){
            System.out.println(states.get(i));
        }
    }
}
