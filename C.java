public class C {
    static int x = 10;//Static variable are created out side the main method with static keyword and belongs to class
    // // (means can only be accessed by class name).
    //static variables has a global access.
    public static void main(String[] args){
       // System.out.println(C.x);
       C c= new C();
       c.test();


    }
    public void test(){
        System.out.println(C.x);
    }
}
    


