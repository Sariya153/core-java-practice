
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
//Default construtor  - If you don't write any constructor, 
// Java silently provides an empty one for you at the compilation time with no arguments.
//Default construtor is not appilcable for object with arguments.
//If in the same program object with and without argument is created then default construtor is not applicable.
// (Java automatically gives you a default no-argument constructor — but only if you haven't written any constructor at all in your class. The moment you write even one constructor (with or without parameters), Java stops providing that automatic default one.)