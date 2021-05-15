package practice;

public class LoopControl {

    public void whileLoop() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;

        }
    }

    public void forLoop(){
        for (int i=1;i<=100;i++){
            System.out.println(i);

        }
    }

    public void doWhileLoop(){
        int i=101;
        do{
            System.out.println(i);
            i++;
        } while(i<=150);
    }
}
