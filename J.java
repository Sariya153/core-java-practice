
//Constructor specifically initializes the object at creation
//Constructor overloading
public class J {
    J(){
        System.out.println(1);
    }
    J(int x){
        System.out.println(x);
    }
    J(int a, char b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] arags){
J j = new J();
J j1= new J(10);
J j2 = new J(10, 'c');
    }
}
