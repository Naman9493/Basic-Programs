import java.util.*;

public class factorial {
     public static int factorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return(fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.: ");
        int n=sc.nextInt();
        int ab=factorial(n);
        System.out.println(ab);
}}
