package javareview;

public class Encapsulation {

    private String geekName;
    private int geekAge;
    private String geekRoll;

    public String getName(){
        return geekName;
    }

    public int getAge(){
        return geekAge;
    }

    public String getRoll(){
        return geekRoll;
    }

    public void setName(String newName){
        geekName=newName;

    }

    public void setAge(int newAge){
        geekAge=newAge;
    }

    public void setRoll(String newRoll){
        geekRoll = newRoll;

    }

}
