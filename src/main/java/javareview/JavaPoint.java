package javareview;

public class JavaPoint {
    public void LearnStringMethod(){
        String myString="JavaPoint";
        int intIndexOf=myString.indexOf("Point");
        System.out.println(intIndexOf);


        int a= myString.indexOf('i',2);
        System.out.println(a);

       int b= myString.indexOf('P');
        System.out.println(b);

        String  c=myString.substring(2);
        System.out.println(c);

        String  d=myString.substring(0,4);
        System.out.println(d);


        int e=myString.length();
        System.out.println(e);

        String newString=myString.replace("Java","Python");
        System.out.println(newString);

        String trimString="Java Point";
        String f=trimString.trim();
        System.out.println(f);






    }



}
