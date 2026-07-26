public class D {
    int x = 10;
    int y = 20;
    static int  a = 30;
    public static void main(String[] args){
D d = new D();
System.out.println(d.x);//with only one object we can access all the non static variables of the same class.
System.out.println(d.y);
System.out.println(D.a);
    }
}
