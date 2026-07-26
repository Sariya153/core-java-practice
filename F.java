//Reference variables - These can store either a object's address or null value.
//Ex: F f = new F(); and F f = null;
// Two types - 1. Local reference variable which can only be declared and accessed in the same method.
// 2. Static reference vairiable, which can be delcared outside the main method and has the global access.
//Local and static variable can have the same name.
public class F {

    static F f = new F();
    public static void main(String[] args){
        F f = new F();
        System.out.println(f);
        f.test();
        }

        public void test(){
            System.out.println(f);
        }
}
