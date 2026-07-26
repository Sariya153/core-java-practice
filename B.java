public class B {
            int x = 10;//non static variable created outside the main method without static keyword and belongs to object (means they can only be accessed by object)
public static void main(String [] args){
        B b = new B();
        System.out.println(b.x);
    }
}
