public class Classmethods {
static int topspeed(){
return 200;
}
static String car(){
    return"bmw m5 cs";
}
public static void main(String[] args){
    Classmethods atb=new Classmethods();

    System.out.println("my car is" +atb.car() +"my top spedd" +atb.topspeed());
}
    
}
