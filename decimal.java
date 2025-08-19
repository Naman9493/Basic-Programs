import java.util.*;
public class decimal {
    public static void main(String[] args) {
        
     Scanner sc= new Scanner(System.in);
        System.out.print("Enter no.: ");
      int n =sc.nextInt();
      int b=0;
       int c=0;
       while(n>0){
        int a=n%10;
        b=b+a*(int)Math.pow(2, c);
          c++;
          n=n/10;
      }
      System.out.println(b);
    }
}
