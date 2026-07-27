public class H {
    public static void main(String[] args){
H h = new H();
h.test(10,"Saayu");
h.test1(10,20, 30, 40, 50, 60);
h.test2("Saayu", "Sariya", "Saniya", "Rihan");
    }
    public void test(int x, String a){
        System.out.println(x);
        System.out. println(a);
    }
public void test1(int...x){
System.out.println(x[0]);
System.out.println(x[1]);
System.out.println(x[2]);
System.out.println(x[3]);
System.out.println(x[4]);
System.out.println(x[5]);
}

public void test2(String...a){//using Varargs for each loop 
    for (String val : a){
            System.out.println(val);

    }
}

}
//Method arguments - Method arguments are the actual values you pass into a method when you call it. 
// They fill in the method's parameters with real data.
// int...x = This is called varargs (short for variable-length arguments). The ... (three dots) tells Java: "this method can accept any number of int arguments — zero, one, or many."

//Behind the scenes, Java collects all the values you pass into an array,
//  and that's why you can access them using array indexing like x[0], x[1], etc.
//Varargs must be the last parameter in the method signature: