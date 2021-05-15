package practice;

public class LearnEncaplsulation {
    private String geekName;
    private String geekRoll;
    private int geekAge;

    public String getName(){
        return geekName;

    }

    public String getRoll(){
        return geekRoll;
    }

    public int getAge(){
        return geekAge;
    }


    public void setName(String newValue){
        geekName=newValue;
    }

    public void setRoll (String newValue){
        geekRoll=newValue;

    }


    public void setAge (int newValue){
        geekAge=newValue;

    }

}
