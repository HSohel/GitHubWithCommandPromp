package practice;

import java.util.ArrayList;
import java.util.List;

public class ConverArraytoList {
    public void arraytoList(){
        String[] arraylanguages={"Java","C#","Python","C++","Rubi"};
        List<String>listOfLanguages=new ArrayList<>();
        for (String language:arraylanguages){
            listOfLanguages.add(language);
        }
        System.out.println(listOfLanguages);
    }
}
