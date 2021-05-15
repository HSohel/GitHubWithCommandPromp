package javareview;

public class Enum {
    enum level{
        HIGH,
        MEDIUM,
        LOW
    }


    public void learnEnum(){
        level  myLevel= level.HIGH;
        String myString=myLevel.toString();

    switch (myString){

        case "HIGH":
            System.out.println("Value is HIGH");
            break;
        case "MEDIUM":
            System.out.println("Value is MEDIUM");
            break;
        case "LOW":
            System.out.println("Value is LOW");
            break;
    }

    level [] allLevels=level.values();
    for (level l:allLevels){
        System.out.println(l);
    }

   }
}
