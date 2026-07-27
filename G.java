public class G {
    public static void main(String[] args){
        G g = new G();
      int x =   g.test();
      String y= G.text();
System.out.println(x);
System.out.println(y);
    }
//public void test(){}//void method
    public int test(){//non static method
       return 100;
    }

    public static String text(){//Static method should be called by the class name.
        return "Saayu";

    }
}
//If the method is void it cannot return a value. 
