package practice;

public class LearnArray {
    public void stringArray(){
        String[] states={"New York", "New Jersey", "Pennsylvania", "Delaware","Virginia"};

        //for(int i=0;i<states.length;i++){
          // System.out.println("The name of the State is :"+states[i]);
        //}

        for(String state:states){
            System.out.println("The name of the State is :"+state);
        }

    }


    public int[]arrayFirstElement (int[]a,int[]b){
        //int[]a={1,2,3};
        //int[]b={7,8,9};
        return new int [] {a[0],b[0]};
    }

    public void splitArray(){
        String names="John,Mathew,Ali,Donald Trump,Joe Biden, Kamala Harris";

        String[] nameArray=names.split(",");

        for(String name:nameArray){
            System.out.println("The person name is "+name);

        }

        String sentence="I live in NewYork";   //Reverse this sentence
        String [] words=sentence.split(" ");
        for (int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");

        }


    }



}
