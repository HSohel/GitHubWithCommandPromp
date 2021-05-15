package practice;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    HashMap<String,String>Hmap=new HashMap<>();
    public void AddHashMapValue(){
        Hmap.put("IE","Internet Explorer");
        Hmap.put("Chrome","Chrome Browser");
        Hmap.put("Safari","Safari Browser");
        Hmap.put("FireFox","Mozilla Browser");
        Hmap.put("OPera","Linux Browser");
        //String BrowserName=Hmap.get("IE");
        //System.out.println("BrowserName is "+BrowserName);

        //for (Map.Entry map:Hmap.entrySet()){
            //System.out.println("Browser :"+map.getKey()+ " and Browser value :"+map.getValue());
        //}
    }

    public void PrintHashmapValue(String key){
        AddHashMapValue();
        System.out.println("Browser Name is "+Hmap.get(key));

    }
}
