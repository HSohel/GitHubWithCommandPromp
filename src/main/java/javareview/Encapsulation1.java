package javareview;

public class Encapsulation1 {
    private String geekName;
    private int geekAge;
    private String geekRoll;


    public String getGeekName(){
        return geekName;
    }

    public int getGeekAge(){
    return  geekAge;
    }

    public String getGeekRoll(){
        return geekRoll;
    }

    public void setGeekName(String newName){
        geekName=newName;
    }

    public void setGeekAge(int newAge){
        geekAge=newAge;
    }

    public void setGeekRoll(String newRoll){
        geekRoll=newRoll;
    }

}
