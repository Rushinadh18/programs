import java.util.*;
public class recursion {
    static int mon(int n){
        if (n==0 || n==1){
            return 1;

        }
        else{
            return n*mon(n-1);
        }
    }
    static void main(String... args){
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        System.out.println(mon(m));
    }

}

