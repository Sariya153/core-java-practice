public class C {
    static int x = 10;
    public static void main(String[] args){
       // System.out.println(C.x);
       C c= new C();
       c.test();


    }
    public void test(){
        System.out.println(C.x);
    }
}

//Static variable are created out side the main method with static keyword and belongs to class
    // // (means can only be accessed by class name).
    //static variables has a global access.
    //Not necessary to initialize a static variable, depending on the data type,default value will get assigned.
    //can be accessed by ClassName.variableName
    //Static variable Name
    //reference Variable.static Variable Name(gets autocorrected works but should not be used)
    


