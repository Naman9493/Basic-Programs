import java.util.*;
public class prime {
     public static boolean isprime(int a) {
           for(int i=2;i<=a-1;i++){
            if(a%i==0){
              return false;}
           }
          return true;
        }
        public static void primein_range(int n) {
            for(int i=2;i<n;i++){
                if(isprime( i)){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter range: ");
            int a=sc.nextInt();
            primein_range(a);
            
        }
}
