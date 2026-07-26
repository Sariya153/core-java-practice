public class E {
public static void main(String[] args){
   E e = new E();
   e.test();
    //int x = 10;//Local variable created inside method and can be accessed only within the created method and cannot be accessed outside the method
                 //System.out.println(x);//and without initialization we cannot access the local variable
   }
   public void test(){
    int x = 10;
    System.out.println(x);
   }


}

