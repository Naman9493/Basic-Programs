import java.util.*;
    public class binary {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter no.: ");
      int n =sc.nextInt();
      int b=0;
       int c=0;
       while(n>0){
        int a=n%2;
        if(a!=0 && a!=1){System.out.print("WRONG INPUT !");
            break;}  
          else { b=b+a*(int)Math.pow(10, c);
          c++;
          n=n/2;}
      }
      System.out.println(b);
    }
}
