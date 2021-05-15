package javareview;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
   HashMap<String, String>hMap=new HashMap<>();

   public void  learnHashMap(){
       hMap.put("IE","Internet Explorer");
       hMap.put("Chrome","IGoogle Chrome");
       hMap.put("Safari","Safari Browser");
       hMap.put("OPera","Linux Browser");

       System.out.println(hMap.get("Chrome"));

       for (Map.Entry map:hMap.entrySet()){
           System.out.println(map.getKey()+" "+map.getValue());

       }

   }




}
