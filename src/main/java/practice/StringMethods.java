package practice;

public class StringMethods {
    public void IndexOf(){
        String myString="I live in Pennsylvania";
        int IndexNumber=myString.indexOf('n',3);
        System.out.println("index number of Pennsylvania is :"+IndexNumber);

    }

    public void MethodSubString(){
        String myString="My native country is Bangladesh";
        String subString=myString.substring(10,17);
        System.out.println("Expected Substring is "+subString);
        int intLength=myString.length();
        System.out.println("length of my string is "+intLength);
        String strReplace=myString.replace("Bangladesh","United States");
        System.out.println(strReplace);
        String strTrim=myString.trim();
        System.out.println("Sentence after trim is :"+strTrim);
        boolean strContains=myString.contains("India");
        System.out.println(strContains);



    }
}
