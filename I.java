//Consturtors is a special method that runs automatically when you create an object using new keyword. 
//It is used to initiaize the object.
//It has to be same name as the class name and it does not have any return type not even void.
//Whenever an object is created consturctor gets called. 
//Contructors are internally, permanently void.
// If return type is given to the constructor, it will be converted into method, it will no longer be consturctor.



public class I {
    //I(){
    //void I(){//return type is given so it ia method now and it needs to be called.
    I(int...x){
         for(int val : x){
            System.out.println(val);
   
    }
}
    public static void main(String[] args){
I i =  new I(1000, 200, 300, 40);
//i.I();
  }
}
