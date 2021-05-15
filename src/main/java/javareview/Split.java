package javareview;

public class Split {
    public void learnSplit(){
        String name="New York,New Jersey,Pennsylvania,Maryland,Virginia,North Carolina";
        String[] nameArray=name.split(",");

        for(String x:nameArray){
            System.out.print(x+" ");
        }

        for(int a =nameArray.length-1;a>=0;a--){
            System.out.print("Reverse names are "+nameArray[a]+" ");
        }
    }
}
