package javareview;

public class superKeyword {
    public static void main(String [] Args){
        B objB=new B();
        objB.abc();
    }
}
  class A {
    public void abc(){
        System.out.println("A abc");
    }
  }

  class B extends A{
      public void abc() {
          super.abc();
          System.out.println("B abc");
      }
  }