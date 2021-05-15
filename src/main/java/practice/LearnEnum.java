package practice;

public class LearnEnum {
    enum transport{
        PLANE, TRAIN,  AUTOMOBILE;


    }

    public void printEnum(){
        System.out.println(transport.PLANE);
        System.out.println(transport.TRAIN);
        System.out.println(transport.AUTOMOBILE);

        transport [] allTransport =transport.values();

        for (transport t:allTransport){
            System.out.println(t);

        }

    }

}
